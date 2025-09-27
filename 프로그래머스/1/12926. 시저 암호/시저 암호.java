class Solution {
    public String solution(String s, int n) {
        StringBuilder answerBuilder = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 문자가 소문자인 경우
            if (Character.isLowerCase(ch)) {
                char shifted = (char) (ch + n);
                // 'z'를 넘어갈 경우 알파벳 개수인 26을 빼고 순환
                if (shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }
                answerBuilder.append(shifted);
            } 
            // 문자가 대문자인 경우
            else if (Character.isUpperCase(ch)) {
                char shifted = (char) (ch + n);
                // 'Z'를 넘어갈 경우 알파벳 개수인 26을 빼서 순환
                if (shifted > 'Z') {
                    shifted = (char) (shifted - 26);
                }
                answerBuilder.append(shifted);
            } 
            // 문자가 공백인 경우
            else {
                answerBuilder.append(ch);
            }
        }

        return answerBuilder.toString();
    }
}