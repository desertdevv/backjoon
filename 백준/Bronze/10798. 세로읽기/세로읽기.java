import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        //스캐너대신 버퍼드리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[5];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();

            // 비교해서 더큰값 저장 (Math.max)
            maxLength = Math.max(maxLength, words[i].length());
        }
        
        // Stirng대신 qlfej
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < words[i].length()) {
                    result.append(words[i].charAt(j));
                }
            }
        }

        System.out.println(result);
    }
}