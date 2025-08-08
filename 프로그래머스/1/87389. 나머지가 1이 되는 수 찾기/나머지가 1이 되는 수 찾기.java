class Solution {
    public int solution(int n) {
        // 2부터 n-1까지 반복
        for (int x = 2; x < n; x++) {
            // n을 x로 나눈 나머지가 1인지 확인
            if (n % x == 1) {
                return x;
            }
        }

        return 0;
    }
}