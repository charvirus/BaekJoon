package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1003 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int num) {
        if (dp[num][0] == null || dp[num][1] == null) {
            dp[num][0] = fibonacci(num - 1)[0] + fibonacci(num - 2)[0];
            dp[num][1] = fibonacci(num - 1)[1] + fibonacci(num - 2)[1];
        }
        return dp[num];
    }
}
