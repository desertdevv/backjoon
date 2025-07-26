class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            // 기자번호, 약수구하기
            int knightCount = divisorCount(i);

            // 약수의개수가 제한보다 큰지 확인
            if (knightCount > limit) {
                // 제한 수치를 초과하면 정해진 공격력
                answer += power;
            } else {
                // 제한 수치 이하면 약수의 개수만큼 추가
                answer += knightCount;
            }
        }

        
        return answer;
    }


    private int divisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                // 제곱수인 경우 약수가 한 개만 추가
                count++;
            } else if (n % i == 0) {
                // i가 n의 약수이면 두 개를 추가
                count += 2;
            }
        }
        return count;
    }
}