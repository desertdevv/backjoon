import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> yearningMap = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int currentScore = 0; 
            
            
            for (String person : photo[i]) {
               
                currentScore += yearningMap.getOrDefault(person, 0);
            }
            answer[i] = currentScore;
        }
        
        return answer;
    }
}