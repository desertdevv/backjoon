import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        
        // reverOrder를 사용하기위하여 integer로 다시담아주기
        Integer[] matsInteger = new Integer[mats.length];
        for (int i = 0; i < mats.length; i++) {
            matsInteger[i] = mats[i];
        }
        Arrays.sort(matsInteger, Collections.reverseOrder());

        int parkRows = park.length;   
        int parkCols = park[0].length; 

        for (int matSize : matsInteger) {
            // 돗자리크기 > 공원 크기 인경우
            
            if (matSize > parkRows || matSize > parkCols) {
                continue;
            }

            
            for (int r = 0; r <= parkRows - matSize; r++) {
                for (int c = 0; c <= parkCols - matSize; c++) {
                    boolean can = true; // 돗자리 가능 / 불가능

                    for (int i = r; i < r + matSize; i++) {
                        for (int j = c; j < c + matSize; j++) {
                            if (!park[i][j].equals("-1")) {
                                can = false;
                                break;
                            }
                        }
                        if (!can) {
                            break;
                        }
                    }

                    // 돗자리가 놔지면 그게 가장큰 크기의 돗자리
                    if (can) {
                        return matSize;
                    }
                }
            }
        }

        // 돗자리 불가능
        return -1;
    }
}