class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 작은 수와 큰 수를 정함
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // start부터 end까지 모든 정수를 더함
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        
        return answer;
    }
}