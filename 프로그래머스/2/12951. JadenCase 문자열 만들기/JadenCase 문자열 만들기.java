class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean isStart = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 공백인 경우
            if (c == ' ') {
                answer.append(c);
                isStart = true; // 공백 뒤에는 새로운 단어가 시작됨
            } 
            // 공백이 아닌 경우
            else {
                if (isStart) {
                    // 단어의 시작이면 대문자로 변환
                    answer.append(Character.toUpperCase(c));
                    isStart = false; // 단어의 시작을 지났으므로 false로 변경
                } else {
                    // 단어의 시작이 아니면 소문자로 변환
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        
        return answer.toString();
    }
}