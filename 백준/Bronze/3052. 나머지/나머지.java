import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> remain = new HashSet<Integer>();

        for(int i = 1; i <= 10; i++) {
            int num= scanner.nextInt();
            int remains = num % 42;
            remain.add(remains);
        }
        System.out.println(remain.size());

    }
}