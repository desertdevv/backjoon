class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        int paintedNow = 0;


        for (int s : section) {
            if (s > paintedNow) {
                answer++;
                paintedNow = s + m - 1;
            }
        }

        return answer;
    }
}