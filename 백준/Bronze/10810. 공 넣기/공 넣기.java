import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] baskets = new int[n];

        for(int into =0; into< m; into++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int basketIndex = i-1; basketIndex < j; basketIndex++) {
                baskets[basketIndex] = k;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();





    }
}