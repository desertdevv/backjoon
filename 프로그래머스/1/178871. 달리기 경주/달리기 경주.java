import java.util.HashMap;
import java.util.Map;

class Solution {

    public String[] solution(String[] players, String[] callings) {

        String[] answer = players;

        Map<String, Integer> playerRanks = new HashMap<>();
        for (int i = 0; i < answer.length; i++) {
            playerRanks.put(answer[i], i);
        }

        for (String calledPlayer : callings) {
            int currentRank = playerRanks.get(calledPlayer);

            // 추월당한 선수
            String overtakenPlayer = answer[currentRank - 1];

            // 선수배열에서 추월당한선수 순서바꿔주기
            
            // 앞 등수에 추월한 선수 배치
            answer[currentRank - 1] = calledPlayer;    
            // 뒷 등수에 추월당한 선수 배치
            answer[currentRank] = overtakenPlayer;

            // 선수정보 업데이트
            playerRanks.put(calledPlayer, currentRank - 1);
            playerRanks.put(overtakenPlayer, currentRank);
        }

        return answer;
    }
}