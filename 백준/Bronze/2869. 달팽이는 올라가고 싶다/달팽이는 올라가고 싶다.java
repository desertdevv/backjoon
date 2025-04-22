import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        
        // 마지막날엔 암멈추니까 a만큼은 뺴고 계산
        int days = (v - a) / (a - b);
        
        // 딱떨어지면 도착 아니면 하루더
        if ((v - a) % (a - b) != 0) {
            days++;
        }
        
        days++;

        System.out.println(days);
    }
}