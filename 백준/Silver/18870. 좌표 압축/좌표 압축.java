import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] original = new int[n];
        int[] list = new int[n];
        HashMap<Integer, Integer> numbers = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            list[i] = original[i];
        }

        Arrays.sort(list);

        int rank = 0;
        for (int order : list) {
            
            // 없는 값이면 증가시키면서 등록해주기
            if (!numbers.containsKey(order)) {
                numbers.put(order, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int value : original) {
            sb.append(numbers.get(value)).append(" ");
        }

        // 맨뒤 공백이 하나 있으니까 trim으로 제거
        System.out.println(sb.toString().trim());
    }
}
