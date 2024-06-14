import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        long sum = 0;
        for (int i = 0; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            st.nextToken();
            if (i == 0) {
                sum = x1;
            } else {
                sum = (x1 + sum * x) % 1000000007;
            }
        }
        System.out.println(sum);
    }
}