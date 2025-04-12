import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;

        if (1 <= n && n <= 10000) {
            for(int i = 1; i <= n; i++) {
                m = m + i;
            }
            System.out.println(m);
        }

    }
}