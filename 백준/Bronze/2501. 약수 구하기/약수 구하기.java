import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        List<Integer> measure = new ArrayList<>();
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                measure.add(i);
            }
        }

        Collections.sort(measure);

        if (measure.size() < q) {
            System.out.println(0);
        } else {
            System.out.println(measure.get(q - 1));
        }
    }
}