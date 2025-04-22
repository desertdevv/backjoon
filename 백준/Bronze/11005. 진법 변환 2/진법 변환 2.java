import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Character> digits = new ArrayList<>();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            // 나머지 구하기
            int remainder = n % b;
            // 나머지가 10보다작은경우 (1~9)
            if (remainder < 10) {
                digits.add((char) (remainder + '0'));
            // 나머지가 10보다 큰경우(10~)
            } else {
                digits.add((char) (remainder - 10 + 'A'));
            }
            n /= b;
        }
        
        //순서가 반대니까 뒤집어주기
        Collections.reverse(digits);

        for (char digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

    }
}