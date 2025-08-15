class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 3진법으로 변환하고 뒤집은 문자열 만들기
        StringBuilder reversedTernary = new StringBuilder();
        
        // n이 0이 될 때까지
        while (n > 0) {
            // n을 3으로 나눈 나머지를 문자열에 추가 > 앞뒤 반전 3진법 생성
            reversedTernary.append(n % 3);
            // n을 3으로 나누어 다음 자릿수를 계산
            n /= 3;
        }
        
        // 앞뒤 반전 3진법 문자열을 다시 10진법 정수로 변환
        // Integer.parseInt(string, radix) x진법의 문자열을 10진법 정수로 바꿔줍니다.
        answer = Integer.parseInt(reversedTernary.toString(), 3);
        
        return answer;
    }
}