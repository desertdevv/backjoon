import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastPosition = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 해시맵에 현재 문자가 있는지 확인
            if (lastPosition.containsKey(currentChar)) {
                // 있으면, 현재 위치와 마지막 위치의 차이를 계산하여 answer에 저장
                answer[i] = i - lastPosition.get(currentChar);
            } else {
                // 없으면, 처음 나온 문자이므로 -1을 저장
                answer[i] = -1;
            }

            // 현재 문자의 마지막 위치를 현재 인덱스로 갱신
            lastPosition.put(currentChar, i);
        }
 
        return answer;
    }
}