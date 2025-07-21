import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
       
        StringBuilder answerBuilder = new StringBuilder();

        // 1. skip에 포함된 문자를 빠르게 찾기 위해 Set에 저장합니다.
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        // 2. 입력 문자열 s의 각 문자를 순회합니다.
        for (char c : s.toCharArray()) {
            char currentChar = c;
            int count = 0;

            // 3. index 만큼 유효한 다음 알파벳을 찾습니다.
            while (count < index) {
                // 알파벳을 하나 뒤로 이동
                currentChar++;
                
                // 'z'를 넘어가면 'a'로 순환
                if (currentChar > 'z') {
                    currentChar = 'a';
                }

                // 이동한 알파벳이 skip 문자가 아니라면 count를 1 증가
                if (!skipSet.contains(currentChar)) {
                    count++;
                }
            }
            // 최종 변환된 문자를 결과에 추가합니다.
            answerBuilder.append(currentChar);
        }
        
        
        String answer = answerBuilder.toString();
        return answer;
    }
}