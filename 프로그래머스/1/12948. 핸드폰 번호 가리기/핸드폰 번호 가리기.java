class Solution {
    public String solution(String phone_number) {

        char[] ch = phone_number.toCharArray();

        // 2마지막 4개 문자를 제외한 앞부분을 *로 변경합니다.

        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}