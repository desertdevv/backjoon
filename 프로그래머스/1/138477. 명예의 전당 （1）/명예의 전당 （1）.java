import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];
        

        ArrayList<Integer> hallOfFame = new ArrayList<>();

     
        for (int i = 0; i < score.length; i++) {
            // 현재 가수의 점수
            hallOfFame.add(score[i]);
            
            Collections.sort(hallOfFame);

            //크기가 k보다 크면 가장 낮은 점수를 제거
            if (hallOfFame.size() > k) {
                hallOfFame.remove(0);
            }

            answer[i] = hallOfFame.get(0);
        }

        return answer;
    }
}