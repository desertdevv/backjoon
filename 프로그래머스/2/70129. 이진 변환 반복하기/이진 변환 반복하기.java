class Solution {
    public int[] solution(String s) {
        int convertCount = 0; // 이진 변환 횟수
        int removeZeroCount = 0; // 제거된 0의 개수 합계

        // s가 "1"이 될 때까지 반복
        while (!s.equals("1")) {
            // 변환 전 길이
            int lengthBefore = s.length();

            // 모든 "0"을 제거 (""로 치환)
            s = s.replace("0", "");
            
            // 변환 후 길이 (1만 남은 개수)
            int lengthAfter = s.length();

            // 제거된 0의 개수 누적 (전체 길이 - 남은 길이)
            removeZeroCount += (lengthBefore - lengthAfter);
            
            // 남은 길이를 2진수 문자열로 변환하여 다시 s에 저장
            s = Integer.toBinaryString(lengthAfter);
            
            // 6. 변환 횟수 증가
            convertCount++;
        }

        return new int[]{convertCount, removeZeroCount};
    }
}