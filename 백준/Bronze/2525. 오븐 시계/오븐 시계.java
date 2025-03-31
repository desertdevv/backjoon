import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt(); 
        int M = scanner.nextInt();
        int C = scanner.nextInt();

        int CookingTime = H * 60 + M + C;
        int endH = (CookingTime / 60) % 24;
        int endM = CookingTime % 60;

        System.out.println(endH + " " + endM);

        scanner.close();
    }
}