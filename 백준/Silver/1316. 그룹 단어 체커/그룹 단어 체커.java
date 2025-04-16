import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.next();

            // 1개짜리 단어인 경우
            if (word.length() <= 1) {
                groupWordCount++;
                continue;
            }

            Set<Character> chars = new HashSet<>();
            char lastChar = word.charAt(0);
            chars.add(lastChar);
            boolean isGroup = true;
            
            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                // 전이랑 현재랑 불일치
                if (currentChar != lastChar) {
                    // 이미 있는놈이면 끗
                    if (chars.contains(currentChar)) {
                        isGroup = false;
                        break;
                    }
                    chars.add(currentChar);
                    lastChar = currentChar;
                }
            }

            if (isGroup) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);






    }
}