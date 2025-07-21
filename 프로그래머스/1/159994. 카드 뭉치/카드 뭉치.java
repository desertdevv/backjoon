class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        // cards1과 cards2의 현재 위치를 가리키는 인덱스
        int idx1 = 0;
        int idx2 = 0;

        // goal 배열의 모든 단어를 순서대로 확인합니다.
        for (String word : goal) {
            
            // cards1의 다음 단어와 일치하는지 확인
            // idx1이 배열 범위를 벗어나지 않는지 먼저 확인해야 합니다.
            if (idx1 < cards1.length && word.equals(cards1[idx1])) {
                idx1++; // 일치하면 cards1의 다음 단어로 넘어갑니다.
            
            // cards2의 다음 단어와 일치하는지 확인
            // idx2가 배열 범위를 벗어나지 않는지 먼저 확인해야 합니다.
            } else if (idx2 < cards2.length && word.equals(cards2[idx2])) {
                idx2++; // 일치하면 cards2의 다음 단어로 넘어갑니다.
            
            // 두 카드 뭉치 모두에서 현재 단어를 만들 수 없는 경우
            } else {
                answer = "No";
                return answer;
            }
        }

        // 반복문이 모두 실행되었다면 goal을 만들 수 있다는 의미입니다.
        answer = "Yes";
        return answer;
    }
}