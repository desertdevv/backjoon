class Solution {
    public int[] solution(String[] wallpaper) {
        // answer 배열을 [lux, luy, rdx, rdy]로 사용합니다.
        // lux와 luy는 최소값을 찾아야 하므로 큰 값으로 초기화합니다.
        // rdx와 rdy는 최대값을 찾아야 하므로 작은 값으로 초기화합니다.
        int[] answer = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                // 파일# 찾기
                if (wallpaper[i].charAt(j) == '#') {
                    // 현재까지 찾은 파일들의 가장 위쪽, 왼쪽 좌표
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    
                    // 현재까지 찾은 파일들의 가장 아래쪽, 오른쪽 좌표를 갱신합니다.
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
        }

        // rdx, rdy 가장 아래쪽/오른쪽 파일의 다음 칸이어야 +1 시키기
        answer[2] += 1; 
        answer[3] += 1; 
        
        return answer;
    }
}