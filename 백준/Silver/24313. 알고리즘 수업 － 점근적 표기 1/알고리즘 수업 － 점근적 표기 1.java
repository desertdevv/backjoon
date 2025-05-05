import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        if (a1 <= c && (long) a1 * n0 + a0 <= (long) c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
