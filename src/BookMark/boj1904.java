package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1904 {
    static int[] DP = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;

        for (int i = 3; i < DP.length; i++) {
            DP[i] = -1;
        }

        System.out.println(set(R));
    }

    static int set(int N) {
        if (DP[N] == -1)
            DP[N] = (set(N - 1) + set(N - 2)) % 15746;
        return DP[N];
    }
}
