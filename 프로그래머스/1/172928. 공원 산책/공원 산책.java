class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 공원의 높이와 너비
        int H = park.length;
        int W = park[0].length();

        int startRow = 0;
        int startCol = 0;

        // park 배열을 순회하여 s찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }

        
        int[] answer = {startRow, startCol};

        
        for (String route : routes) {
            String[] command = route.split(" ");
            // 방향
            char direction = command[0].charAt(0);
            // 거리
            int distance = Integer.parseInt(command[1]);

            int currentRow = answer[0];
            int currentCol = answer[1];
            boolean canMove = true;

            // 이동할 거리만큼 한 칸씩 이동하며 이동가능한지 검사
            for (int i = 1; i <= distance; i++) {
                int nextRow = answer[0];
                int nextCol = answer[1];

                // 방향에 따라 다음 위치를 계산합니다.
                if (direction == 'N') {
                    nextRow -= i;
                } else if (direction == 'S') {
                    nextRow += i;
                } else if (direction == 'W') {
                    nextCol -= i;
                } else if (direction == 'E') {
                    nextCol += i;
                }

                //  공원을 벗어나는지 확인합니다.
                if (nextRow < 0 || nextRow >= H || nextCol < 0 || nextCol >= W) {
                    canMove = false;
                    break;
                }
                // 장애물이 있는지 확인
                if (park[nextRow].charAt(nextCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            // 이동이가능할때만 이동하기
            if (canMove) {
                if (direction == 'N') {
                    answer[0] -= distance;
                } else if (direction == 'S') {
                    answer[0] += distance;
                } else if (direction == 'W') {
                    answer[1] -= distance;
                } else if (direction == 'E') {
                    answer[1] += distance;
                }
            }
        }

        return answer;
    }
}