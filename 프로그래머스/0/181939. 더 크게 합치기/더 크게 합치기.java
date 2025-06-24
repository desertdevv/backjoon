class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        
        String abString = strA + strB;
        int ab = Integer.parseInt(abString);

        
        String baString = strB + strA;
        int ba = Integer.parseInt(baString);

        
        if (ab >= ba) {
            answer = ab;
        } else {
            answer = ba;
        }

        return answer;
    }
}