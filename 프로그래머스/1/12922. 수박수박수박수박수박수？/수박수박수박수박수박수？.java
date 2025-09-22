class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // 0부터 n-1까지 반복
        for (int i = 0; i < n; i++) {
            // i가 짝수일 경우 "수"를 추가
            if (i % 2 == 0) {
                sb.append("수");
            }
            // i가 홀수일 경우 "박"을 추가
            else {
                sb.append("박");
            }
        }
        
        // StringBuilder 객체를 String으로 변환합니다.
        answer = sb.toString();
        
        return answer;
    }
}