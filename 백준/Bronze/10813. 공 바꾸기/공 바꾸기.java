import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] baskets = new int[n];

        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        for (int o = 0; o < m; o++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int p = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = p;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();





    }
}