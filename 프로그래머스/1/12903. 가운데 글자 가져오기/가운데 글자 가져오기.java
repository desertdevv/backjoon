class Solution {

    public String solution(String s) {
        int length = s.length();
        // 문자열 길이의 중간 지점 찾기
        int mid = length / 2;

        // 길이가 짝수인 경우
        if (length % 2 == 0) {
            // 중간 지점의 앞 글자와 중간 지점의 글자를 잘라내어 반환
            return s.substring(mid - 1, mid + 1);
        } 
        
        // 길이가 홀수인 경우
        else {
            // 중간 지점의 글자 하나만 잘라내어 반환합니다.
            return s.substring(mid, mid + 1);
        }
    }
}