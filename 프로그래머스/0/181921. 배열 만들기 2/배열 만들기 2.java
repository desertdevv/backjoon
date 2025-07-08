import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // 0과5로만 이루어진 함수
    private boolean isComposedOfZeroAndFive(int num) {
        String strNum = String.valueOf(num);

        for (char c : strNum.toCharArray()) {
            if (c != '0' && c != '5') {
                return false; // 0도 5도 아니면 false 반환
            }
        }
        return true; // 모든 자릿수가 0 또는 5이면 true 반환
    }

    public int[] solution(int l, int r) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isComposedOfZeroAndFive(i)) {
                answerList.add(i);
            }
        }

        // 결과 리스트가 비어있으면 -1을 담은 배열 반환
        if (answerList.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[answerList.size()];
            for (int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }
            return answer;
        }
    }
}