package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] inp = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            inp[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < cnt - 1; i++) {
            int distance = inp[i + 1] - inp[i];
            gcd = getGcd(distance, gcd);
        }
        System.out.println((inp[cnt-1]-inp[0])/gcd + 1 - inp.length);
    }

    static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
