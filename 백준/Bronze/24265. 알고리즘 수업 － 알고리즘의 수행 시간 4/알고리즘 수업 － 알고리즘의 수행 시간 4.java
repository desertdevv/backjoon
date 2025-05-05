import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 실행횟수가 n-1 n-2  ... 1 까지니까 
        long time = (long)n * (n - 1) / 2;
        System.out.println(time);

        // 최고차항이 n제곱 
        System.out.println(2);

    }
}

