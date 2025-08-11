class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 현재 숫자가 제곱수인지 확인 (약수의 개수가 홀수)
            if (i % Math.sqrt(i) == 0) {
                // 제곱수인 경우 (약수의 개수가 홀수)
                answer -= i; // answer에서 현재 숫자를 뺍니다.
            } else {
                // 제곱수가 아닌 경우 (약수의 개수가 짝수)
                answer += i; // answer에 현재 숫자를 더합니다.
            }
        }

        return answer;
    }
}