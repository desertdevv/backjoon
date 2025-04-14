import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] submit = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int studentNumber = scanner.nextInt();
            submit[studentNumber] = true;
        }

        int count = 0;
        for (int i = 1; i <= 30; i++) {
            if (!submit[i]) {
                System.out.println(i);
                count++;
                if (count == 2) {
                    break;
                }
            }
        }

    }
}