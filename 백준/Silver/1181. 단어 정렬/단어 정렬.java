import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        HashSet<String> wordArray = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            wordArray.add(scanner.next());
        }

        String[] words = wordArray.toArray(new String[0]);

        Arrays.sort(words, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            } else {
                return s1.compareTo(s2);
            }
        });

        for (String word : words) {
            System.out.println(word);
        }


    }
}
