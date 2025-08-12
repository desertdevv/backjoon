import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 일치하는 번호의 개수와 알아볼 수 없는 번호(0)의 개수를 저장할 변수입니다.
        int matchCount = 0;
        int zeroCount = 0;

        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            // 0이 아닌 경우, 당첨 번호가 있는지 확인합니다.
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    // 번호가 일치하면 matchCount를 1 증가
                    matchCount++;
                    break;
                }
            }
        }

        // 최고 순위
        // 현재 일치하는 번호의 개수(matchCount)에 알아볼 수 없는 번호의 개수(zeroCount)를 더하기
        // 이 값이 0이 모두 당첨 번호일 경우의 최대 일치 개수
        int maxMatches = matchCount + zeroCount;
        
        // 최저 순위
        // 현재 일치하는 번호의 개수(matchCount)가 최저 순위의 기준
        // 0이 모두 당첨 번호가 아닌 경우입니다.
        int minMatches = matchCount;

        
        answer[0] = getRank(maxMatches); // 최고 순위
        answer[1] = getRank(minMatches); // 최저 순위
        
        return answer;
    }

    // 일치하는 번호의 개수에 따라 순위를 반환하는 함수입니다.
    public int getRank(int matchCount) {
        switch (matchCount) {
            case 6:
                return 1; // 6개 일치: 1등
            case 5:
                return 2; // 5개 일치: 2등
            case 4:
                return 3; // 4개 일치: 3등
            case 3:
                return 4; // 3개 일치: 4등
            case 2:
                return 5; // 2개 일치: 5등
            default:
                return 6; // 그 외: 6등 (낙첨)
        }
    }
}