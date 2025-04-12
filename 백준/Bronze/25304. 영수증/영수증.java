import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        총 금액 X
//        물건의 종류수 N
//        가격 a 갯수 b

            int X = scanner.nextInt();
            int N = scanner.nextInt();

            int c = 0;

            for (int i = 0; i < N; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                c+= a * b;
            }

            if (X == c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

    }
}