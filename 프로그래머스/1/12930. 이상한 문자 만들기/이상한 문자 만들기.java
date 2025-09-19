class Solution {
    public String solution(String s) {
        
        StringBuilder answer = new StringBuilder();
        int wordIndex = 0;

        // 입력 문자열 s의 각 문자를 순회합니다.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 문자가 공백인지 확인합니다.
            if (c == ' ') {
                // 공백이면 결과에 그대로 추가합니다.
                answer.append(' ');
                // 인덱스 0으로 초기화
                wordIndex = 0;
            } else {
                // 문자가 알파벳일 경우, 단어 인덱스가 홀/짝인지 구분
                if (wordIndex % 2 == 0) {
                    // 짝수 인덱스이면 대문자
                    answer.append(Character.toUpperCase(c));
                } else {
                    // 홀수 인덱스이면 소문자
                    answer.append(Character.toLowerCase(c));
                }
                // 단어 인덱스를 1 증가시킵니다.
                wordIndex++;
            }
        }

        // StringBuilder 객체를 String으로 변환하여 반환합니다.
        return answer.toString();
    }
}