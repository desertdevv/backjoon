import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 한 변에서의 점갯수
        int dots = (int) Math.pow(2, n) + 1;

        // 총 점의 개수 계산
        long totolDots = (long) dots * dots;

        System.out.println(totolDots);
    }
}