import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String st = scanner.next();

        int length = st.length();

        int sum = 0;

        for(int i = 0; i < length; i++){
            switch (st.charAt(i)){

                case 'A': case 'B': case 'C':
                    sum+=3;
                    break;
                case 'D': case 'E': case 'F':
                    sum+=4;
                    break;
                case 'G': case 'H': case 'I':
                    sum+=5;
                    break;
                case 'J': case 'K': case 'L':
                    sum+=6;
                    break;
                case 'M': case 'N': case 'O':
                    sum+=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sum+=8;
                    break;
                case 'T': case 'U': case 'V':
                    sum+=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum+=10;
                    break;
            }
        }
        System.out.println(sum);





    }
}