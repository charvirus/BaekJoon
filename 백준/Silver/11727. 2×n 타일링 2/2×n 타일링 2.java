import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        int inp = Integer.parseInt(br.readLine());

        for (int i = 3; i <= inp; i++) {
            dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10007;
        }

        System.out.println(dp[inp]);
    }
}