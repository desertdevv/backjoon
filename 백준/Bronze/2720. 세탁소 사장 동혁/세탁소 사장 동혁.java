import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        for (int i = 0; i < money; i++) {
            int change = scanner.nextInt();

            int quarters = change / 25;
            change %= 25;

            int dimes = change / 10;
            change %= 10;

            int nickels = change / 5;
            change %= 5;

            int pennies = change;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }

    }
}