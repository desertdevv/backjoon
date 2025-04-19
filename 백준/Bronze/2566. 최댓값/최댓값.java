import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] excel = new int[9][9];
        // 0도 포함이라서 -1로 초기화했슴당.
        int max = -1;
        int row = -1;
        int col = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                excel[i][j] = scanner.nextInt();
                if (excel[i][j] > max) {
                    max = excel[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}