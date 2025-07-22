class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCount = 0;
        int diffrentCount = 0;
        char firstChar = ' ';

        for (int i = 0; i < s.length(); i++) {

            if (sameCount == diffrentCount) {
                answer++;
                firstChar = s.charAt(i);
            }


            if (s.charAt(i) == firstChar) {
                sameCount++;
            } else {
                diffrentCount++;
            }
        }

        return answer;
    }
}