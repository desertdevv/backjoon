import java.lang.Math;

class Solution {
    public int solution(int[] nums) {
        int answer = 0; // 소수가 되는 경우의 수를 저장할 변수

        // 3중 반복문으로 서로 다른 3개의 수를 선택하는 모든 조합을 확인
        // 첫 번째 수는 i, 두 번째는 j, 세 번째는 k
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 세 수의 합을 계산
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 합이 소수이면 answer를 1 증가
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    // 소수인지 판별하는 헬퍼 함수
    public boolean isPrime(int num) {
        // 1 이하의 수는 소수가 아님
        if (num <= 1) {
            return false;
        }
        
        // 2부터 숫자의 제곱근까지 반복
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 나누어 떨어지는 수가 하나라도 있으면 소수가 아님
            if (num % i == 0) {
                return false;
            }
        }
        
        // 위 반복문을 통과하면 소수임
        return true;
    }
}