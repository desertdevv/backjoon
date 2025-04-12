import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int N = number/4;

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            answer.append("long ");
        }
        answer.append("int");

        System.out.println(answer.toString());


    }
}