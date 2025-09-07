import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        //배열의 길이가 1 이하인 경우 -1
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 가장 작은 수를 제외하고 배열 만들기
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];

        //
        for (int num : arr) {
            // 현재까지의 가장 작은 수보다 더 작은 수를 발견하면 변경
            if (num < min) {
                min = num;
            }
            list.add(num);
        }
        
        // 리스트에서 가장 작은 수에 해당하는 원소를 제거
        
        list.remove(Integer.valueOf(min));

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}