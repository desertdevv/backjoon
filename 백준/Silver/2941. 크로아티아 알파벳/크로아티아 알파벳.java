import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            // 2개짜리
            if (i < word.length() - 1) {
                if (word.substring(i, i + 2).equals("c=") ||
                        word.substring(i, i + 2).equals("c-") ||
                        word.substring(i, i + 2).equals("d-") ||
                        word.substring(i, i + 2).equals("lj") ||
                        word.substring(i, i + 2).equals("nj") ||
                        word.substring(i, i + 2).equals("s=") ||
                        word.substring(i, i + 2).equals("z=")) {
                    count++;
                    i++;
                    continue;
                }
            }

            //3개짜리
            if (i < word.length() - 2) {
                if (word.substring(i, i + 3).equals("dz=")) {
                    count++;
                    i += 2;
                    continue;
                }
            }
            // 보통알파벳들
            count++;
        }

        System.out.println(count);




    }
}