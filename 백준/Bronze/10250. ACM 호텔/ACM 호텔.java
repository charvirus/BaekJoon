import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int x, y, n;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());

            if (n % x == 0) {
                bw.write("" + ((x) * 100 + n / x));
            } else {
                bw.write("" + ((n % x) * 100 + (n / x) + 1));
            }
            bw.write("\n");

        }
        br.close();
        bw.flush();
    }
}