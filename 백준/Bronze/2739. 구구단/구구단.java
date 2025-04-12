import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }

    }
}