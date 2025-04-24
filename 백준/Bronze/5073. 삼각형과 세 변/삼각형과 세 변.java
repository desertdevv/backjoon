import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            
            
            //Arrays.sort 오름차순정렬
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}

