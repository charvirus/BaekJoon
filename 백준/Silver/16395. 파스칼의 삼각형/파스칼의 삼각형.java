import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        set(n);
        System.out.println(dp[n - 1][k - 1]);
    }

    static void set(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][0] = 1;
                dp[i][i] = 1;
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
    }
}