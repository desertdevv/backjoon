import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int n = A.length;

        // 두 배열 모두 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        //A는 앞에서부터(최소값), B는 뒤에서부터(최대값) 곱합니다.
        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        return answer;
    }
}