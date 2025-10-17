import java.util.Arrays; // Arrays.sort()를 사용하기 위해 import

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        
        for (int departmentRequest : d) {
            budget -= departmentRequest;
            
            if (budget < 0) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}