import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] basket = new int[n];

        // 각 바구니에 번호 순서대로 넣기
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        // 순서 역순으로 만들기
        for (int k = 0; k < m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            // 바구니랑 번호랑 숫자 일치 시키기
            int start = i - 1;
            int end = j - 1;

            // 역순으로 만들기
            while (start < end) {
                int change = basket[start];
                basket[start] = basket[end];
                basket[end] = change;
                start++;
                end--;
            }
        }

        // 결과
        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();





    }
}