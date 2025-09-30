class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수 계산
        int gcd = calculateGcd(n, m);
        
        // 최소공배수 계산합니다.
        int lcm = (n * m) / gcd;
        
        // 결과를 배열에 담아주기
        return new int[]{gcd, lcm};
    }
    
    // 최대공약수를 구하는 함수
    public int calculateGcd(int a, int b) {
        // b가 0이 될 때까지 반복
        while (b != 0) {
            int r = a % b; // a를 b로 나눈 나머지
            
            // 이전 b값을 a에, 나머지 r을 b에 대입
            a = b;
            b = r;
        }
        return a; // b가 0이 되면 a가 최대공약수
    }
}