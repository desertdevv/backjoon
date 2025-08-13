
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; 

       
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i]가 true이면 양수
            if (signs[i]) {
                answer += absolutes[i];
            } 
            // signs[i]가 false이면 음수
            else {
                answer -= absolutes[i]; // 절대값만구하니까 음수제외
            }
        }
        
        
        return answer;
    }
}