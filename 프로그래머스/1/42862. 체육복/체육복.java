class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 학생별 체육복 상태 배열
        int[] studentStatus = new int[n + 1];
        
        // 여벌 체육복이 있는 학생 (+1)
        for (int r : reserve) {
            studentStatus[r]++;
        }
        
        //도난당한 학생 표시 (-1)
        for (int l : lost) {
            studentStatus[l]--;
        }
        
        // 1번 학생부터 n번 학생까지 순회
        for (int i = 1; i <= n; i++) {
            // 이 학생이 체육복이 없다면 (-1)
            if (studentStatus[i] == -1) {
                // 앞 번호 학생(i-1)에게 빌릴 수 있는지 확인
                if (i > 1 && studentStatus[i - 1] == 1) {
                    studentStatus[i - 1]--; // 앞 학생은 여벌이 없어짐
                    studentStatus[i]++;     // 현재 학생은 체육복을 받음
                }
                //(앞 학생에게 못 빌렸다면) 뒷 번호 학생(i+1)에게 빌릴 수 있는지 확인
                else if (i < n && studentStatus[i + 1] == 1) {
                    studentStatus[i + 1]--; // 뒷 학생은 여벌이 없어짐
                    studentStatus[i]++;     // 현재 학생은 체육복을 받음
                }
            }
        }
        
        // 최종 인원 계산
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            // 체육복이 0개가 아닌 경우
            if (studentStatus[i] >= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}