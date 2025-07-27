import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        // 점수가 가장 높은 사과부터 m개
        // i는 각 상자에서 점수가 가장 낮은 사과의 인덱스
        for (int i = score.length - m; i >= 0; i -= m) {
            // 상자 가격 =  최저사과 * 상자의개수
            answer += score[i] * m;
        }

        return answer;
    }
}