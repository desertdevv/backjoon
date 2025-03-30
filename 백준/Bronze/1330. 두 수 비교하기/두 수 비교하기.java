import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        String C = scanner.nextLine();
        String[] D = C.split(" ");
        
        int A = Integer.parseInt(D[0]);
        int B = Integer.parseInt(D[1]);
        
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        scanner.close();
    }
}