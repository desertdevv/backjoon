class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);

        // t 문자열을 p의 길이만큼씩 잘라 비교
        for (int i = 0; i <= t.length() - pLength; i++) {
            // t에서 p와 길이가 같은 부분문자열을 추출
            String subString = t.substring(i, i + pLength);
            
            // 부분문자열이 나타내는 수를 long 타입으로 변환
            long tValue = Long.parseLong(subString);

            // p가 나타내는 수보다 작거나 같으면 answer 증가
            if (tValue <= pValue) {
                answer++;
            }
        }
        
        return answer;
    }
}