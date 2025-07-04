class Solution {
    public int solution(int[] num_list) {
      
        String oddNumbers = ""; // 홀수
        String evenNumbers = ""; // 짝수

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenNumbers += num;
            } else {
                oddNumbers += num;
            }
        }

        
        int answer = Integer.parseInt(oddNumbers) + Integer.parseInt(evenNumbers);
       
        return answer;
    }
}