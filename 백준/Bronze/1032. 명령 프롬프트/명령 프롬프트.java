import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time = Integer.parseInt(br.readLine());
        String ans = br.readLine();
        for (int i = 1; i < time; i++) {
            String inp = br.readLine();
            for (int j = 0; j < inp.length(); j++) {
                if (ans.charAt(j) == inp.charAt(j)) {
                    sb.append(inp.charAt(j));
                } else {
                    sb.append('?');
                }
            }
            ans = String.valueOf(sb);
            sb.setLength(0);
        }

        System.out.println(ans);
    }
}