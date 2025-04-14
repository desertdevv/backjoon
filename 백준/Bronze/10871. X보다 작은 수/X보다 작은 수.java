import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < x) {
                sb.append(a[i]).append(" ");
            }
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());


    }
}