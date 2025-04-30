import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            members.add(br.readLine() + " " + i);
        }

        Collections.sort(members, (s1, s2) -> {
            String[] parts1 = s1.split(" ");
            String[] parts2 = s2.split(" ");
            int age1 = Integer.parseInt(parts1[0]);
            int age2 = Integer.parseInt(parts2[0]);
            int name1 = Integer.parseInt(parts1[2]);
            int name2 = Integer.parseInt(parts2[2]);

            if (age1 != age2) {
                return age1 - age2;
            } else {
                return name1 - name2;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String memberStr : members) {
            sb.append(memberStr.split(" ")[0]).append(" ").append(memberStr.split(" ")[1]).append('\n');
        }
        System.out.println(sb);


    }
}
