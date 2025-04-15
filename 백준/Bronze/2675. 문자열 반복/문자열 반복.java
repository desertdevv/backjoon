
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            StringBuilder P = new StringBuilder();


            // 몇번째 char
            for (int j = 0; j < S.length(); j++) {
                char currentChar = S.charAt(j);

                // currentChar r번 붙혀주기
                for (int k = 0; k < R; k++) {
                    P.append(currentChar);
                }
            }
            System.out.println(P);
        }




    }
}