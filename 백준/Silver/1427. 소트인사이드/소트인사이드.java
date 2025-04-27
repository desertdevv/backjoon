import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Character[] digits = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i);
        }

        // 내림차순으로 정렬
        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (char digit : digits) {
            sb.append(digit);
        }

        System.out.println(sb);


    }
}

