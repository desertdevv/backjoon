class Solution {
    public int solution(int a, int b) {
        int answer = 0; 
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        
        String ab = strA + strB;

        
        int abValue = Integer.parseInt(ab);

       
        int twoAB = 2 * a * b;


        if (abValue >= twoAB) {
            answer = abValue;
        } else {
            answer = twoAB;
        }

        return answer;
    }
}