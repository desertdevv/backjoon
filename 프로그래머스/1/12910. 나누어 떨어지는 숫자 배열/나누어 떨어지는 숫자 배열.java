import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int number : arr) {
            // divisor로 나누어 떨어지는지 확인
            if (number % divisor == 0) {
                list.add(number);
            }
        }
        
        // 나누어 떨어지지 않는 경우
        if (list.isEmpty()) {
            return new int[]{-1}; // -1을 담은 배열 반환
        }
        
        // 리스트를 오름차순으로 정렬
        Collections.sort(list);
        
        // 6. 리스트를 int 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}