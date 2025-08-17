import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int turnIndex = -1; // 현재 턴의 인덱스 (0, 1, 2)
        
        char[] darts = dartResult.toCharArray();
        for (int i = 0; i < darts.length; i++) {
            char c = darts[i];

            // score
            if (Character.isDigit(c)) {
                turnIndex++; 
                // 점수가 10점인 경우
                if (c == '1' && darts[i + 1] == '0') {
                    scores[turnIndex] = 10;
                    i++; // 0 문자는 건너뛰기
                } else {
                    scores[turnIndex] = c - '0';
                }
            } 
            // 보너스
            else if (c == 'S') {
                // Single은 1제곱이므로 변경 없음
            } else if (c == 'D') {
                scores[turnIndex] = (int) Math.pow(scores[turnIndex], 2);
            } else if (c == 'T') {
                scores[turnIndex] = (int) Math.pow(scores[turnIndex], 3);
            }
            // 옵션
            else if (c == '*') {
                // 현재 점수 2배
                scores[turnIndex] *= 2;
                // 첫 턴이 아닐 경우 이전 점수 2배
                if (turnIndex > 0) {
                    scores[turnIndex - 1] *= 2;
                }
            } else if (c == '#') {
                // 현재 점수 마이너스
                scores[turnIndex] *= -1;
            }
        }
        
        // 최종 점수
        int answer = scores[0] + scores[1] + scores[2];
        return answer;
    }
}