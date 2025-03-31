import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = scanner.nextInt();
        }

        Arrays.sort(dice);

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + dice[2] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            System.out.println(1000 + dice[1] * 100);
        } else {
            System.out.println(dice[2] * 100);
        }

        scanner.close();
    }
}