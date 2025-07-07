class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int start = numLog[i] - numLog[i - 1];
            if (start == 1) {
                answer.append("w");
            } else if (start == -1) {
                answer.append("s");
            } else if (start == 10) {
                answer.append("d");
            } else if (start == -10) {
                answer.append("a");
            }
        }
        return answer.toString();
    }
}