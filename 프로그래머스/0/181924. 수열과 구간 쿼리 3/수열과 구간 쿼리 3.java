class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            answer[k] = arr[k];
        }

        
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

           
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        return answer;
    }
}