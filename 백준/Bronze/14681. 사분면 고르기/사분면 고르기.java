import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if(X >0 && Y >0){
            System.out.println("1");
        }else if (X<0 && Y >0) {
            System.out.println("2");
        }else if (X<0 && Y<0) {
            System.out.println("3");
        }else{
            System.out.println("4");
        }


        scanner.close();
    }
}