class Solution {
    boolean solution(String s) {
        // "열려있는" 괄호의 개수를 세는 카운터
        int count = 0;

        // 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                // 여는 괄호면 카운트 증가
                count++;
            } else if (c == ')') {
                // 닫는 괄호면 카운트 감소
                count--;
            }

            // 실패 조건 1 닫는 괄호가 먼저 나와 count가 음수가 되면 false 
            if (count < 0) {
                return false;
            }
        }

        //실패 조건 2 루프가 끝난 후 0보다 크면 여는 괄호가 남은 것 false
        return (count == 0);
    }
}