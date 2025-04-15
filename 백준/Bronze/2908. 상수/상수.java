import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        char[] aArray = a.toCharArray();
        char[] reverseA = new char[3];
        aArray= a.toCharArray();
        for(int i = 0; i<3; i++) {
            reverseA[i] = aArray[3-i-1];
        }
        int A = Integer.parseInt(new String(reverseA));


        char[] bArray = new char[3];
        char[] reverseB = new char[3];
        bArray= b.toCharArray();
        for(int i = 0; i<3; i++) {
            reverseB[i] = bArray[3-i-1];
        }
        int B = Integer.parseInt(new String(reverseB));

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }






    }
}