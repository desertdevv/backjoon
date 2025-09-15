import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char char1 = s1.charAt(n);
                char char2 = s2.charAt(n);

                // n번째 문자가 서로 같다면
                if (char1 == char2) {
                    // 사전 순으로 정렬
                    return s1.compareTo(s2);
                } else {
                    // n번째 문자가 서로 다르다면
                    // 해당 문자를 기준으로 오름차순 정렬
                    return char1 - char2;
                }
            }
        });
        
        // 정렬된 배열을 반환합니다.
        return strings;
    }
}