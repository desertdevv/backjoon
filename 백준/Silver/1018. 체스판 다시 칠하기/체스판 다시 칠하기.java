import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = scanner.next().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int whiteStart = 0;
                int blackStart = 0;

                for (int row = i; row < i + 8; row++) {
                    for (int col = j; col < j + 8; col++) {
                        // 흰색으로 시작하는 체스판
                        char white = ((row - i) + (col - j)) % 2 == 0 ? 'W' : 'B';
                        if (board[row][col] != white) {
                            whiteStart++;
                        }

                        // 검은색으로 시작하는 체스판
                        char black = ((row - i) + (col - j)) % 2 == 0 ? 'B' : 'W';
                        if (board[row][col] != black) {
                            blackStart++;
                        }
                    }
                }
                minPaint = Math.min(minPaint, Math.min(whiteStart, blackStart));
            }
        }

        System.out.println(minPaint);


    }
}

