class Solution {
    public int solution(int num) {
        // 입력된 수가 1이면 0을 반환
        if (num == 1) {
            return 0;
        }

        // int 범위를 넘어설 수 있으므로 long 타입으로
        long currentNum = num;
        
        // 최대 500번까지만 반복
        for (int count = 0; count < 500; count++) {
            // 짝수인 경우
            if (currentNum % 2 == 0) {
                currentNum /= 2;
            } 
            // 홀수인 경우
            else {
                currentNum = currentNum * 3 + 1;
            }
            
            // 작업 후 결과가 1이 되면 현재까지의 횟수를 반환
            if (currentNum == 1) {
                return count + 1; // 횟수는 1부터 시작하므로 count에 1을 더함
            }
        }
        
        // 500번을 초과하면 -1을 반환
        return -1;
    }
}