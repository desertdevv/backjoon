import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 현재 처리할 숫자
            int[] command = commands[i];
            
            // 3. command에서 i, j, k 값을 가져옵니다. 
            // 배열 인덱스는 0부터 시작하므로 각 값에서 1 뺴주기
            int start = command[0] - 1; // 자르기 시작할 인덱스
            int end = command[1];       // 자르기 끝낼 인덱스
            int k = command[2] - 1;     // 정렬 후 선택할 인덱스

            // array를 start 인덱스부터 end 인덱스 전까지 자르기
            int[] slicedArray = Arrays.copyOfRange(array, start, end);

            // 잘라낸 배열을 오름차순 정렬
            Arrays.sort(slicedArray);

            // 정렬된 배열에서 k번째 값을 찾아 answer 배열에 저장
            answer[i] = slicedArray[k];
        }


        return answer;
    }
}