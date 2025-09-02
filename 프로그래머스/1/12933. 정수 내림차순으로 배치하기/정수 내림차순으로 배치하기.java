import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        
        char[] charArray = str.toCharArray();
        

        Arrays.sort(charArray);
        
        String reversedStr = new StringBuilder(new String(charArray)).reverse().toString();
        
        long answer = Long.parseLong(reversedStr);
        
        return answer;
    }
}