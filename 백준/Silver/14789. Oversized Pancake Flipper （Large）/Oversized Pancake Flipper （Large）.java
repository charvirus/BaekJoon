import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int Trial = 1; Trial <= T; Trial++) {
            st = new StringTokenizer(br.readLine(), " ");
            String S = st.nextToken();
            int K = Integer.parseInt(st.nextToken());
            char[] chars = S.toCharArray();
            int flip = 0;

            for (int i = 0; i + K <= S.length(); i++) {
                if (chars[i] == '-') {
                    for (int j = i; j < K + i; j++) {
                        chars[j] = (chars[j] == '+') ? '-' : '+';
                    }
                    flip++;
                }
            }

            boolean flag = true;
            for (int j = 0; j < S.length(); j++) {
                if (chars[j] == '-') {
                    flag = false;
                    break;
                }
            }
            sb.append("Case #" + Trial + ": ");
            if (flag) {
                sb.append(flip + "\n");
            } else {
                sb.append("IMPOSSIBLE\n");
            }
        }
        System.out.println(sb);
    }
}