class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int product = 1;
        int sum = 0;     

        
        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        
        int sumSquare = sum * sum;


        if (product < sumSquare) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}