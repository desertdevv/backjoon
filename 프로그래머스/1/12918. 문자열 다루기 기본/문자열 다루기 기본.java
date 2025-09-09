class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        // 문자열이 숫자로만 구성되어 있는지 찾기
        try {
            // 문자열을 정수로 변환
            Integer.parseInt(s);
            // 변환에 성공하면 숫자로만 이루어진 것이므로 true
            return true;
        } catch (NumberFormatException e) {
            // 변환 중 예외가 발생하면 숫자가 아닌 문자가 포함된 것이므로 false 반환
            return false;
        }
    }
}