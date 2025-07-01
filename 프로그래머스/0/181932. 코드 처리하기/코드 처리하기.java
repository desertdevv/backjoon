class Solution {
    public String solution(String code) {
        String answer = ""; 
        int mode = 0; 
      
        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            if (mode == 0) {
              
                if (currentChar == '1') {
                    
                    mode = 1;
                } else {
                    
                    if (idx % 2 == 0) { 
                        answer += currentChar; 
                    }
                }
            } else { 
                
                if (currentChar == '1') {
                   
                    mode = 0;
                } else {
                    
                    if (idx % 2 != 0) {
                        answer += currentChar;
                    }
                }
            }
        }

        
        if (answer.isEmpty()) {
            return "EMPTY";
        } else {
            return answer;
        }
    }
}