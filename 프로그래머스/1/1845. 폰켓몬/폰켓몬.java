import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 최대 포켓몬수
        int maxChoose = nums.length / 2;

        //포켓몬의 종류, 수를 계산
        Set<Integer> poketmons = new HashSet<>();
        for (int num : nums) {
            poketmons.add(num);
        }
        int totalTypes = poketmons.size();

        // 가져갈 수 있는 마릿수와 포켓몬의 총 종류 수 중 더 작은 값을 선택
        if (totalTypes < maxChoose) {
            answer = totalTypes;
        } else {
            answer = maxChoose;
        }

        return answer;
    }
}