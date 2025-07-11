class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        // 보드의 크기
        int n = board.length;
        
        // 기준이 되는 칸의 색깔을 가져옵니다.
        String targetColor = board[h][w];
        
        // h와 w의 변화량을 나타내는 배열
        // 위 i=0 (h-1, w)
        // 아래 i=1 (h+1, w)
        // 왼 i=2 (h, w-1)
        // 오 i=3 (h, w+1)
        
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};
        
        // 4개의 인접한 칸을 확인
        for (int i = 0; i < 4; i++) {
            // 확인할 칸의 h, w 좌표 찾기
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            // 좌표가 보드안에있는지 확인
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                // 보드 범위 내에 있다면 기준 칸의 색과 같은지 비교
                if (board[h_check][w_check].equals(targetColor)) {
                    // 색이 같다면 answer 값을 1 증가시키기
                    answer++;
                }
            }
        }
        
        return answer;
    }
}