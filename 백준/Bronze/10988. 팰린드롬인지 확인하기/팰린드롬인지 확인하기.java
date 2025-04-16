
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        
        int left = 0;
        int right = word.length() - 1;
        int isPalindrome = 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = 0;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);

    }
}