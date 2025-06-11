import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        
        System.out.println(result.toString());
        
      
    }
}