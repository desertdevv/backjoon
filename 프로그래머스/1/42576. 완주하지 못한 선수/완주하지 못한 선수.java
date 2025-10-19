import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 두 배열을 모두 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 정렬된 배열을 순서대로 비교
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            // 이름이 다른 순간, 해당 참가자가 완주하지 못한 선수
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        // 3. 루프를 다 돌았는데도 찾지 못했다면, 마지막 참가자가 완주하지 못한 선수
        return participant[i];
    }
}