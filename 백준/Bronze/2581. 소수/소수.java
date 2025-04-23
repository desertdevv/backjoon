
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(i);
                }
            }
        }

        if (primes.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int prime : primes) {
                sum += prime;
            }
            System.out.println(sum);
            System.out.println(Collections.min(primes));
        }
    }
}