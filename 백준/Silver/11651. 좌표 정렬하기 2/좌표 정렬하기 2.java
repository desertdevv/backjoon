import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1[1] != p2[1]) {
                // integer.compare(a,b) a,b 비교해서 -1 0 1 로 나옴
                return Integer.compare(p1[1], p2[1]);
            } else {
                return Integer.compare(p1[0], p2[0]);
            }
        });

        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }


    }
}
