
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int num = 666;

        while (true) {
            String s = String.valueOf(num);
            if (s.contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }


    }
}
