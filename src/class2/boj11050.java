package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    static long factorial(int r) {
        if (r <= 1) {
            return 1;
        }
        return r * factorial(r - 1);
    }
}
