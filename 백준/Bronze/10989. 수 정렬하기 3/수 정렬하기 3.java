
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[10001]; 

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num]++; // 해당 숫자의 등장 횟수 증가
        }

        for (int i = 1; i <= 10000; i++) {
            while (counts[i] > 0) {
                bw.write(i + "\n");
                counts[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }
}

