class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 보유중 빈병 : n , 교환해야할 빈병 a
        while (n >= a) {
            // 받을수있는 콜라의수
            int receivedCokes = (n / a) * b;
            
            // 총 받은 콜라의 수에 더하기
            answer += receivedCokes;
            
            
            // 빈병 수 갱신
            n = (n % a) + receivedCokes;
        }
        
        return answer;
    }
}