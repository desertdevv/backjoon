import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split(" ");
        String n = number[0];
        int b = Integer.parseInt(number[1]);

        long result = 0;
        // 지수
        int exponent = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            // i번째자리
            char digitChar = n.charAt(i);
            int digitInt;

            if (Character.isDigit(digitChar)) {
                // 10진법미만
                digitInt = digitChar - '0';
            } else {
                //10진법이상
                digitInt = digitChar - 'A' + 10;
            }


            // Math.pow (제곱 (밑수,지수))
            result += digitInt * Math.pow(b, exponent);
            exponent++;
        }

        System.out.println(result);
    }
}