package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj12755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        int cnt = 0;
        while (true) {
            i++;
            cnt += (int) Math.floor(Math.log10(i)) + 1;
            if (cnt >= n) {
                break;
            }
        }
        String str = Integer.toString(i);

        System.out.println(str.charAt(str.length() - 1 + n - cnt));
    }
}
