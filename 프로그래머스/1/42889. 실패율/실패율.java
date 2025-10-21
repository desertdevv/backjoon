import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    // 1. 스테이지 번호와 실패율을 함께 저장할 클래스 정의
    class StageInfo implements Comparable<StageInfo> {
        int stageNumber;
        double failureRate;
        
        public StageInfo(int stageNumber, double failureRate) {
            this.stageNumber = stageNumber;
            this.failureRate = failureRate;
        }
        
        // 정렬 기준
        @Override
        public int compareTo(StageInfo other) {
            // 실패율이 같으면 스테이지 번호 오름차순
            if (this.failureRate == other.failureRate) {
                return Integer.compare(this.stageNumber, other.stageNumber);
            }
            // 실패율 내림차순 정렬
            return Double.compare(other.failureRate, this.failureRate);
        }
    }
    
    public int[] solution(int N, int[] stages) {
        // 스테이지별 멈춘 인원수 계산 (N+2 크기 사용: 1~N, N+1(클리어))
        int[] stuckCounts = new int[N + 2];
        for (int stage : stages) {
            stuckCounts[stage]++;
        }
        
        List<StageInfo> stageList = new ArrayList<>();
        int totalPlayersReached = stages.length; // 총 도전자 수
        
        // 실패율 계산 (1번 스테이지부터 N번 스테이지까지)
        for (int i = 1; i <= N; i++) {
            int stuck = stuckCounts[i]; // 현재 스테이지에 멈춘 인원
            
            double failureRate = 0.0;
            // 도달한 유저가 0이 아닐 때만 실패율 계산
            if (totalPlayersReached > 0) {
                failureRate = (double) stuck / totalPlayersReached;
            }
            
            // 리스트에 스테이지 정보 추가
            stageList.add(new StageInfo(i, failureRate));
            
            // 다음 스테이지로 넘어가기 전, 현재 스테이지 인원 제외
            totalPlayersReached -= stuck;
        }
        
        // 정렬
        Collections.sort(stageList);
        
        // 정렬된 리스트에서 스테이지 번호만 추출
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).stageNumber;
        }
        
        return answer;
    }
}