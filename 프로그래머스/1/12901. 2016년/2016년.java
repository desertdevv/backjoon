class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 인덱스를 월과 맞추기 위해 0은 0으로 비우기
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 1월 1일부터 a월 b일까지의 총 일수를 계산합니다.
        int totalDays = 0;
        // a월 이전까지의 모든 달의 일수를 더합니다.
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        // 마지막으로 a월의 b일을 더합니다.
        totalDays += b;
        
        // 총 일수에서 1을 뺀 값을 7로 나눈 나머지를 구하여 요일 배열의 인덱스를 찾습니다.
        // (1월 1일이 첫 번째 날이므로 인덱스 0에 해당하도록 1을 빼줍니다)
        int dayIndex = (totalDays - 1) % 7;
        
        return dayOfWeek[dayIndex];
    }
}