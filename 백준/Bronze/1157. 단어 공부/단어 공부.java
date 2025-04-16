import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = scanner.next().toUpperCase();
        int[] counts = new int[26];
        
        
        // 단어의 위치 , 알파벳이 나오면 -A를 해서 카운트 ++ 시켜주기
        for (int i = 0; i < alphabet.length(); i++) {
            char charAtIndex = alphabet.charAt(i);
            int index = charAtIndex - 'A';
            counts[index]++;
        }

        int maxCount = 0;
        char most = '?';
        int countOfMax = 0;

        for (int i = 0; i < 26; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                most = (char) ('A' + i);
                countOfMax = 1;
            } else if (counts[i] == maxCount) {
                countOfMax++;
            }
        }

        if (countOfMax > 1) {
            System.out.println("?");
        } else {
            System.out.println(most);
        }




    }
}