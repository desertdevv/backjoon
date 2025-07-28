class Solution {
    public String solution(int[] food) {
        // 왼쪽 선수 음식
        StringBuilder leftSide = new StringBuilder();

        // 1번 음식부터 순서대로 처리 food[0]은 물
        for (int i = 1; i < food.length; i++) {
            // 각 음식을 두 선수가 나눠 먹을 양을 계산 (짝수로 만들기 위해 2로 나눔)
            int count = food[i] / 2;
            
            // 계산된 양만큼 음식 번호를 문자열에 추가
            for (int j = 0; j < count; j++) {
                leftSide.append(i);
            }
        }

        // 오른쪽 선수 음식 부분은 왼쪽 선수 부분을 뒤집어서 만듦
        String rightSide = new StringBuilder(leftSide).reverse().toString();

        // 최종 음식 배치: (왼쪽 선수 음식) + (물) + (오른쪽 선수 음식)
        String answer = leftSide.toString() + "0" + rightSide;
        
        return answer;
    }
}