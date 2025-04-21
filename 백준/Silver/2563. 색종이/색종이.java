import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //전체넓이
        boolean[][] paper = new boolean[100][100];
        int area = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());


            for (int length = y; length < y + 10; length++) {
                for (int width = x; width < x + 10; width++) {
                    if (!paper[length][width]) {
                        paper[length][width] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}
