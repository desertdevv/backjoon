import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[2000001]; // -1,000,000부터 1,000,000까지의 범위

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num + 1000000]++; // 모든 인덱스를 양수로 만들기위해서 +100000
        }

        for (int i = 0; i <= 2000000; i++) {
            if (counts[i] > 0) {
                bw.write((i - 1000000) + "\n"); // 배열 인덱스에서 1,000,000을 빼서 원래 숫자 복원
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
