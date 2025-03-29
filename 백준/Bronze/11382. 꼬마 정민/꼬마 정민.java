import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String A = scanner.nextLine();
        String[] xx = A.split(" ");

        long B = Long.parseLong(xx[0]);
        long C = Long.parseLong(xx[1]);
        long D = Long.parseLong(xx[2]);

        System.out.println(D + B + C);

        scanner.close();







    }
}