import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 1) {
            return;
        }

        int measure = 2;
        while (n > 1) {
            if (n % measure == 0) {
                System.out.println(measure);
                n /= measure;
            } else {
                measure++;
            }
        }

    }
}
