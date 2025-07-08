import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int minVal = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
               
                if (arr[i] > k) {

                    minVal = Math.min(minVal, arr[i]);
                }
            }


            if (minVal == Integer.MAX_VALUE) {
                answerList.add(-1);
            } else {
                
                answerList.add(minVal);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}