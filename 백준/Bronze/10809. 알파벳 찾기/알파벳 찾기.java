import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int[] alphabet = new int[26];

        // 모든방에 -1를 기본값으로 초기화해주기
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        // 처음 찾은 위치를 알맞은 방에 뿌리기 
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + (i == 25 ? "" : " "));
        }


    }
}