import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들의 찍기 패턴
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각 수포자의 점수 배열
        int[] scores = new int[3];

        for(int i=0; i < answers.length; i++) {

            if(answers[i] == supoja1[i % supoja1.length]) {
                scores[0]++;
            }
            if(answers[i] == supoja2[i % supoja2.length]) {
                scores[1]++;
            }
            if(answers[i] == supoja3[i % supoja3.length]) {
                scores[2]++;
            }
        }
        
        // 가장 높은 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 가장 높은 점수를 받은 사람들을 담을 리스트
        List<Integer> topScorers = new ArrayList<>();
        
        if(maxScore == scores[0]) {
            topScorers.add(1); // 1번 수포자
        }
        if(maxScore == scores[1]) {
            topScorers.add(2); // 2번 수포자
        }
        if(maxScore == scores[2]) {
            topScorers.add(3); // 3번 수포자
        }
        
        int[] answer = new int[topScorers.size()];
        for(int i=0; i < answer.length; i++) {
            answer[i] = topScorers.get(i);
        }
        
        return answer;
    }
}