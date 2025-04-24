
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sides = new int[3];
        sides[0] = scanner.nextInt();
        sides[1] = scanner.nextInt();
        sides[2] = scanner.nextInt();

        Arrays.sort(sides);

        while (sides[2] >= sides[0] + sides[1]) {
            sides[2]--;
        }

        System.out.println(sides[0] + sides[1] + sides[2]);


    }
}

