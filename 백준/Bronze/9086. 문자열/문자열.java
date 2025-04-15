import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String word = scanner.next();
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            System.out.println(first + "" + last);
        }




    }
}