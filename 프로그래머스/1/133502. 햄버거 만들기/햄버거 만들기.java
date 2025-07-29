import java.util.ArrayList;

class Solution {

    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> stack = new ArrayList<>();

        for (int ing : ingredient) {
            stack.add(ing);

            // 스택에 4개 이상의 재료가 쌓였는지 확인
            if (stack.size() >= 4) {
                // 스택의 마지막 4개 재료가1-2-3-1과 일치하는지 확인
                if (stack.get(stack.size() - 4) == 1  // 빵
                 && stack.get(stack.size() - 3) == 2  // 야채
                 && stack.get(stack.size() - 2) == 3  // 고기
                 && stack.get(stack.size() - 1) == 1) { // 빵

                    // 햄버거를 만들었으므로 answer를 1 증가
                    answer++;

                    // 포장된 햄버거 재료(마지막 4개)를 스택에서 제거
                    for (int i = 0; i < 4; i++) {
                        stack.remove(stack.size() - 1);
                    }
                }
            }
        }

        return answer;
    }
}