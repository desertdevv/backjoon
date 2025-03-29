import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int D = B % 10;
        int E = (B/10) % 10;
        int F = (B/100) % 10;

        int G = A * D;
        int H = A * E;
        int I = A * F;
        
        int J = (I*100) + (H*10) + (G); 
        
        
        System.out.println(G);
        System.out.println(H);
        System.out.println(I);
        System.out.println(J);




    }
}