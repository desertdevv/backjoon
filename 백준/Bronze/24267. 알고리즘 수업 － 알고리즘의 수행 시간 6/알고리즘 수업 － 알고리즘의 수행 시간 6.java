import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       // n개의 방에서 순서없이 고르는것임으로 조합을 이용한다.
        long time = 0;
        if (n >= 3) {
            time = (long)n * (n - 1) * (n - 2) / 6;
        }

        System.out.println(time);

        //최고차항이 n3승임으로 3
        System.out.println(3);
    }
}
