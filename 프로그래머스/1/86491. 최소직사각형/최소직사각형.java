import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int currentWidth = size[0];
            int currentHeight = size[1];

            // 명함을 회전시켜서 더 작은 쪽을 가로로, 더 큰 쪽을 세로로 
            int rotatedWidth = Math.min(currentWidth, currentHeight);
            int rotatedHeight = Math.max(currentWidth, currentHeight);

            // 현재까지의 최대 가로 길이와 최대 세로 길이를 갱신
            maxWidth = Math.max(maxWidth, rotatedWidth);
            maxHeight = Math.max(maxHeight, rotatedHeight);
        }

        // 지갑의 크
        int answer = maxWidth * maxHeight;

        return answer;
    }
}