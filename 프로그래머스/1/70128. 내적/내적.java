class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        

        for(int i = 0; i < a.length; i++) {
            // 같은 인덱스에 위치한 a와 b의 원소를 곱해주기
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}