class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지의 모든 수를 확인
        for (int i = 1; i <= n; i++) {
            // i가 n의 약수인지
            if (n % i == 0) {
                // 약수이면 answer에 더함
                answer += i;
            }
        }
        
        return answer;
    }
}