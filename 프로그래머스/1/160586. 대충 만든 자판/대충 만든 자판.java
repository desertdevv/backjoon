import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 최대 입력가능횟수가 100
        int[] minPresses = new int[26];
        Arrays.fill(minPresses, 101); // 101은 불가능한값의 예시

        // 3. keymap을 순회하며 각 문자의 최소 터치 횟수를 계산합니다.
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int pressCount = i + 1;
                // 기존의 최소값보다 현재 터치 횟수가 더 작으면 갱신합니다.
                minPresses[c - 'A'] = Math.min(minPresses[c - 'A'], pressCount);
            }
        }

        // 4. targets 배열을 순회하며 각 목표 문자열의 총 터치 횟수를 계산합니다.
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean possible = true;

            for (char c : target.toCharArray()) {
                int pressCount = minPresses[c - 'A'];
                
                // 만약 문자를 keymap에서 찾을 수 없다면 (값이 101이라면)
                if (pressCount == 101) {
                    totalPresses = -1; // 총합을 -1로 설정
                    possible = false;
                    break;             
                }
                
                totalPresses += pressCount;
            }
            
            answer[i] = totalPresses;
        }

        return answer;
    }
}