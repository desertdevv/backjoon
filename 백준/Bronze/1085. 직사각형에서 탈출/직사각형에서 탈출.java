import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int minDistance = Integer.MAX_VALUE;

        // 왼쪽 경계까지의 거리
        minDistance = Math.min(minDistance, x);

        // 오른쪽 경계까지의 거리
        minDistance = Math.min(minDistance, w - x);

        // 아래쪽 경계까지의 거리
        minDistance = Math.min(minDistance, y);

        // 위쪽 경계까지의 거리
        minDistance = Math.min(minDistance, h - y);

        System.out.println(minDistance);

    }
}

