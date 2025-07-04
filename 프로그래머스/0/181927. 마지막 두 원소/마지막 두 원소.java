class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        // 기존것들 answer에 복사하기
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 원소 
        int lastElement = num_list[num_list.length - 1];
        // 그전원소
        int beforeElement = num_list[num_list.length - 2];

        // 조건에 따라 새로운 원소를 계산하여 answer의 마지막에 추가합니다.
        if (lastElement > beforeElement) {
            answer[num_list.length] = lastElement - beforeElement;
        } else {
            answer[num_list.length] = lastElement * 2;
        }
        
        return answer;
    }
}