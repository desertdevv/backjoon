class Solution {

    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 첫 번째 학생 i
        for (int i = 0; i < n - 2; i++) {
            // 두 번째 학생 j 
            for (int j = i + 1; j < n - 1; j++) {
                // 세 번째 학생 k
                for (int k = j + 1; k < n; k++) {
                    // 번호 합이 0인가요?
                    if (number[i] + number[j] + number[k] == 0) {
                        // 합이 0이면 삼총사 ++ 
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}