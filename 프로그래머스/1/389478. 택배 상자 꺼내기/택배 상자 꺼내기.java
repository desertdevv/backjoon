class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;


        int floor = ((num - 1) / w) + 1;
        
        int indexFloor = (num - 1) % w;
        
        int column;

        if (floor % 2 != 0) {
            column = indexFloor;

        } else {
            column = w - 1 - indexFloor;
        }

 
        answer = 0; 
        
        for (int currentFloor = floor; ; currentFloor++) { // 현재 층부터 위에 더 있나 찾기
            int boxNumberCurrentFloor;

            if (currentFloor % 2 != 0) { // 홀수 층: 왼쪽에서 오른쪽으로
                boxNumberCurrentFloor = (currentFloor - 1) * w + column + 1;
            } else { // 짝수 층: 오른쪽에서 왼쪽으로
                boxNumberCurrentFloor = currentFloor * w - column;
            }

            if (boxNumberCurrentFloor <= n) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}