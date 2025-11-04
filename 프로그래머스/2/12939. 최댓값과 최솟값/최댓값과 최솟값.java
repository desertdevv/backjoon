import java.lang.Math;

class Solution {
    public String solution(String s) {
        // 공백을 기준으로 문자열을 분리
        String[] numStrings = s.split(" ");
        
        // 최소값, 최대값 변수
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        
        // 배열을 순회
        for (String numStr : numStrings) {
            // 문자열을 정수로 변환
            int currentNum = Integer.parseInt(numStr);
            
            //최소/최대값 갱신
            minVal = Math.min(minVal, currentNum);
            maxVal = Math.max(maxVal, currentNum);
        }
        
        // "(최소값) (최대값)" 형태로 반환
        return minVal + " " + maxVal;
    }
}