import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int count = 1;
        // 층의 숫자
        int startNum = 2;
        // 방갯수
        int room = 6;
        
        
        while (startNum <= n) {
            startNum += room * count;
            count++;
        }

        System.out.println(count);
    }
}