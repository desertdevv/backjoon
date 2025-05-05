import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 삼중포문 n * n * n
        long time = (long)n * n * n;
        System.out.println(time);

        // n의 3승임으로 3
        System.out.println(3);

    }
}
