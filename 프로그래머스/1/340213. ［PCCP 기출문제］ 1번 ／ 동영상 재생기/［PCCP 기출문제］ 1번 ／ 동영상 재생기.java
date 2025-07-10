class Solution {
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    private String secondsToTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        // 모든 시간을 초 단위로
        int videoLenSec = timeToSeconds(video_len);
        int currentPosSec = timeToSeconds(pos);
        int opStartSec = timeToSeconds(op_start);
        int opEndSec = timeToSeconds(op_end);

        // 처음이 오프닝인지 아닌지
        if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
            currentPosSec = opEndSec;
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosSec -= 10;
                // 0초 미만으로 갈 수 없음
                if (currentPosSec < 0) {
                    currentPosSec = 0;
                }
            } else if (command.equals("next")) {
                currentPosSec += 10;
                // 비디오 길이 초과할 수 없음
                if (currentPosSec > videoLenSec) {
                    currentPosSec = videoLenSec;
                }
            }
            
            // 명령어 실행 후 오프닝 구간인지 확인
            if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
                currentPosSec = opEndSec;
            }
        }

        // 5. 최종 위치를 "mm:ss" 형식으로 변환
        answer = secondsToTime(currentPosSec);
        
        return answer;
    }
}