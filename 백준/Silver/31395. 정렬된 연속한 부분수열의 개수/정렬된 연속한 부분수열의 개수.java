import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int prev = 0;
        long ans = 0;
        long len = 0;
        for (int i = 0; i < a; i++) {
            int inp = Integer.parseInt(st.nextToken());
            if (inp > prev) {
                len++;
            } else {
                ans += (len + 1) * len / 2;
                len = 1;
            }
            prev = inp;
        }
        ans += (len + 1) * len / 2;
        System.out.println(ans);

    }
}