import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //n제곱 만큼 수행 근데 숫자가 매우 크니까 long으로 변환
        long time = (long)n * n;
        System.out.println(time);

        // n제곱이 최고차항임으로 2
        System.out.println(2);

    }
}