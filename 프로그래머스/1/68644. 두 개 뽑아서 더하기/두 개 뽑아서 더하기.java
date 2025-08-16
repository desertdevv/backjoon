import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        // HashSet을 ArrayList로 변환합니다.
        ArrayList<Integer> sortedList = new ArrayList<>(sumSet);
        Collections.sort(sortedList); // 오름차순

        int[] answer = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = sortedList.get(i);
        }
        
        return answer;
    }
}