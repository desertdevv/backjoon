import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char type : types) {
            scores.put(type, 0);
        }

        // survey와 choices를 순회하며 점수를 계산
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            
            // 4(모르겠음)는 점수가 없으므로 건너뛰기
            if (choice == 4) {
                continue;
            }

            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            // 비동의 관련 선택지일 경우 (1, 2, 3)
            if (choice < 4) {
                int score = 4 - choice; 
                // 1 -> 3점, 2 -> 2점, 3 -> 1점
                scores.put(disagree, scores.get(disagree) + score);
            } 
            // 동의 관련 선택지일 경우 (5, 6, 7)
            else {
                int score = choice - 4; 
                // 5 -> 1점, 6 -> 2점, 7 -> 3점
                scores.put(agree, scores.get(agree) + score);
            }
        }

        // 점수비교하여 최종성격 결정
        StringBuilder answerBuilder = new StringBuilder();

        answerBuilder.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        answerBuilder.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        answerBuilder.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        answerBuilder.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');
        
        String answer = answerBuilder.toString();
        return answer;
    }
}