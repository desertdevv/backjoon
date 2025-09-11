import java.util.*;

public class Solution {

    public int[] solution(int []arr) {
        
        ArrayList<Integer> tempList = new ArrayList<>();
        
        // 이전 숫자를 저장할 변수, 배열에 없는 -1로 초기화
        int preNum = -1;
        
        for (int num : arr) {
            // 현재 숫자가 이전 숫자와 다를 경우에만
            if (preNum != num) {
                // tempList에 현재 숫자를 추가
                tempList.add(num);
            }
            // 현재 숫자를 이전 숫자로 업데이트
            preNum = num;
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}