class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] sounds = {"aya", "ye", "woo", "ma"};
        
        
        for (String word : babbling) {
            String temp = word;
            
           // 연속된 같은 발음이 포함된 경우 제외
            if (temp.contains("ayaaya") || temp.contains("yeye") || temp.contains("woowoo") || temp.contains("mama")) {
                continue;
            }

            // 발음 가능한 단어들을 공백으로
            for (String sound : sounds) {
                temp = temp.replace(sound, " ");
            }
            
            
            temp = temp.replace(" ", "");
            
            //남은 문자가 없으면 조카가 발음할 수 있는 단어
            if (temp.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}