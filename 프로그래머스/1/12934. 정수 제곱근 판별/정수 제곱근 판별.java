import java.lang.Math;

class Solution {
    public long solution(long n) {
        // sqrt 제곱근을 구해주는 함수
        long x = (long) Math.sqrt(n);
        
        // x를 다시 제곱한 값이 원래 n과 같은지 확인하여 제곱수인지 판별
        if (x * x == n) {
            // 제곱수가 맞으면 (x + 1)의 제곱을 반환
            return (x + 1) * (x + 1);
        } else {
            // 제곱수가 아니면 -1을 반환한
            return -1;
        }
    }
}