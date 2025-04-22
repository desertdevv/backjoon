import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int cross = 1;
        // 몇개
        int count = 0;

        while (count < x) {
            count += cross;
            cross++;
        }
        cross--;
        
        // 총개수 - 받은수 > 몇번째 분수인지?
        int fraction = count - x;

        if (cross % 2 == 0) {
            // 짝수 번째 대각선
            System.out.println((cross - fraction) + "/" + (1 + fraction));
        } else {
            // 홀수 번째 대각선
            System.out.println((1 + fraction) + "/" + (cross - fraction));
        }
    }
}