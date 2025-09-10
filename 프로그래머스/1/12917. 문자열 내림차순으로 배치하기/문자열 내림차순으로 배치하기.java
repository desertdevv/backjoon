import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        
        // 문자 배열을 오름차순으로 정렬
        Arrays.sort(charArr);
        
        // 정렬된 문자 배열을 다시 문자열로 만들기
        String sortedStr = new String(charArr);
        
        // 문자열을 뒤집어 내림차순으로 만듭니다.
        StringBuilder sb = new StringBuilder(sortedStr);
        String answer = sb.reverse().toString();
        
        return answer;
    }
}