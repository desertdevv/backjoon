
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] find = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            find[i] = scanner.nextInt();
            result[i] = chess[i] - find[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();








    }
}