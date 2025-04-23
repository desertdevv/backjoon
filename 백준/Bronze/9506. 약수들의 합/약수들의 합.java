
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            ArrayList<Integer> perfect = new ArrayList<>();
            int sumPerfect = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    perfect.add(i);
                    sumPerfect += i;
                }
            }

            if (sumPerfect == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < perfect.size(); i++) {
                    System.out.print(perfect.get(i));
                    if (i < perfect.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

    }
}