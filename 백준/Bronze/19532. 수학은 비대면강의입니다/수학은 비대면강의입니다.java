import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        // 연립방정식 사용
        int denominator = (a * e - b * d);
        int xNumerator = (c * e - b * f);
        int yNumerator = (a * f - c * d);

        int x = xNumerator / denominator;
        int y = yNumerator / denominator;

        System.out.println(x + " " + y);


    }
}

