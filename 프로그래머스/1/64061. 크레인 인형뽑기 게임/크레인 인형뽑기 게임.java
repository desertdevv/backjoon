import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 바구니
        Stack<Integer> basket = new Stack<>();

        // moves 배열 순회
        for (int move : moves) {
            // move는 1부터 시작하므로, 0부터 시작하는 인덱스로 변환
            int col = move - 1;
            int doll = 0; // 뽑은 인형을 저장할 변수

            // 인형 찾기 (열을 위에서 아래로 탐색)
            for (int row = 0; row < board.length; row++) {
                // 인형 뽑기
                if (board[row][col] != 0) {
                    doll = board[row][col];   // 인형 번호 저장
                    board[row][col] = 0;      // 뽑힌 자리는 0으로 변경
                    break;                    // 인형을 뽑았으니 이 열 탐색 중단
                }
            }

            // 바구니에 넣기 및 터뜨리기
            // (doll이 0이 아니어야 함 = 인형을 성공적으로 뽑았음)
            if (doll != 0) {
                // 바구니가 비어있지 않고, 맨 위 인형이 현재 인형과 같다면
                if (!basket.isEmpty() && basket.peek() == doll) {
                    basket.pop();     // 바구니에서 인형 제거
                    answer += 2;      // 터진 인형 2개 카운트
                } 
                // 바구니가 비었거나, 맨 위 인형과 다르다면
                else {
                    basket.push(doll); // 바구니에 인형 추가
                }
            }
        }

        // 결과 반환
        return answer;
    }
}