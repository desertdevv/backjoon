import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지의 합 45
        int answer = 45;

        // numbers 배열의 각 원소를 전체 합에서 뺍니다.
        // 즉, numbers에 있는 숫자를 제외한 나머지 숫자의 합을 구하는 과정입니다.
        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}