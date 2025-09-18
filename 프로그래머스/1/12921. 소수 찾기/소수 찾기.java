import java.util.Arrays;

class Solution {
    public int solution(int n) {
        // n+1 크기배열 생성 (0부터 n까지)
        boolean[] isPrime = new boolean[n + 1];

        // 소수인배열들은 true로 초기화
        Arrays.fill(isPrime, true);

        // 0과 1은 소수가 아니므로 false로 설정
        isPrime[0] = false;
        isPrime[1] = false;


        for (int i = 2; i * i <= n; i++) {
            // isPrime[i]가 true이면, i는 소수
            if (isPrime[i]) {
                // i의 배수들을 false로 변경
                // j는 i*i부터 시작
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수(true)의 개수 카운트
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}