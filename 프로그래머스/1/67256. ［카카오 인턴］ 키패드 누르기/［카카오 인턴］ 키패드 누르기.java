import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int leftHandPosition = 10; // *이 10
        int rightHandPosition = 12; // #이 12

        for (int number : numbers) {
            // 1, 4, 7은 왼손으로
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftHandPosition = number;
            } 
            // 3, 6, 9는 오른손으로
            else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightHandPosition = number;
            } 
            // 가운데 열(2, 5, 8, 0)을 누를 경우
            else {
                // 각 손가락으로부터의 거리 계산
                int leftDistance = getDistance(leftHandPosition, number);
                int rightDistance = getDistance(rightHandPosition, number);

                if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftHandPosition = number;
                } else if (rightDistance < leftDistance) {
                    answer.append("R");
                    rightHandPosition = number;
                } else { // 거리가 같을 경우
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightHandPosition = number;
                    } else { // hand.equals("left")
                        answer.append("L");
                        leftHandPosition = number;
                    }
                }
            }
        }

        return answer.toString();
    }


    private int getDistance(int from, int to) {
        // 키패드를 좌표로 생각하여 계산
        // 1(0,0) 2(0,1) 3(0,2)
        // 4(1,0) 5(1,1) 6(1,2)
        // 7(2,0) 8(2,1) 9(2,2)
        // *(3,0) 0(3,1) #(3,2)
        
        if (from == 0) from = 11;
        if (to == 0) to = 11;

        int fromX = (from - 1) / 3;
        int fromY = (from - 1) % 3;
        int toX = (to - 1) / 3;
        int toY = (to - 1) % 3;

        return Math.abs(fromX - toX) + Math.abs(fromY - toY);
    }
}