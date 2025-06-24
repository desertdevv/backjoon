class Solution {
    
    private int addMinutes(int time, int minutesToAdd) {
        int hour = time / 100;
        int minute = time % 100;

        minute += minutesToAdd;

        
        if (minute >= 60) {
            hour += (minute / 60);
            minute %= 60;
        }
        

        return hour * 100 + minute;
    }

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0; 

        
        for (int i = 0; i < schedules.length; i++) {
            int scheduledTime = schedules[i]; 
            int admitTime = addMinutes(scheduledTime, 10); 

            boolean isGift = true; 

            for (int j = 0; j < 7; j++) {
                
                int workOfWeek = ((startday - 1 + j) % 7) + 1; 

                
                if (workOfWeek != 6 && workOfWeek != 7) {
                    int actualArrivalTime = timelogs[i][j];

                    
                    if (actualArrivalTime > admitTime) {
                        isGift = false;
                        break;
                    }
                }
            }

            
            if (isGift) {
                answer++; 
            }
        }

        return answer; 
    }
}