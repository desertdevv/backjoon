
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int sum = i;
            String s = String.valueOf(i);
            
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            
            if (sum == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);


    }
}

