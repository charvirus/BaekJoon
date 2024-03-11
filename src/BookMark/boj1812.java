package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] inp = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            inp[i] = Integer.parseInt(br.readLine());
            sum += inp[i];
        }
        sum /= 2;


        for (int i = 1; i < N - 1; i += 2) {
            sum -= inp[i];
        }

        sb.append(sum + "\n");
        for (int i = 0; i < N - 1; i++) {
            sum = inp[i] - sum;
            sb.append(sum + "\n");
        }

        System.out.println(sb);
    }
}
