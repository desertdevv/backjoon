class Solution {

    public boolean solution(int x) {
        int harshad = x;
        int sum = 0;

        // 각 자릿수의 합을 구하는 과정
        while (harshad > 0) {
            sum += harshad % 10; // 마지막 자릿수를 sum에 더함
            harshad /= 10;       // 마지막 자릿수를 제거
        }

        // 원래의 수 x가 자릿수의 합으로 나누어떨어지는지 확인
        return x % sum == 0;
    }
}