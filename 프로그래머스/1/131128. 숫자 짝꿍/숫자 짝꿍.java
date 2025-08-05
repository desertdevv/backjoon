import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // char 를 int 로 변경 
        // X숫자 카운트
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Y숫자 카운트
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 가장 큰 수를 만들기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 가장 큰 숫자인 9부터 0까지 순회
        for (int i = 9; i >= 0; i--) {
            // 두 수에 공통으로 나타나는 횟수를 구하기
            int commonCount = Math.min(countX[i], countY[i]);
            
            // 공통된 횟수만큼 해당 숫자를 StringBuilder에 추가
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }

        String answer = sb.toString();

        // 공통숫자 없는경우
        if (answer.isEmpty()) {
            return "-1";
        }
        
        // 0으로만 구성되는경우
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        // 그 외
        return answer;
    }
}