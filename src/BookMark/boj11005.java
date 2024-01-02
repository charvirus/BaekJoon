package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int inp = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        StringBuilder output = new StringBuilder();

        while (inp != 0) {
            char c;
            int mod = inp % num;
            if (10 <= mod && mod <= num) {
                c = (char) (55 + mod);
                output.append(c);
            } else {
                c = (char) ('0' + mod);
                output.append(c);
            }
            inp /= num;
        }

        for (int i = output.length()-1; i >= 0; i--) {
            System.out.print(output.charAt(i));
        }
        System.out.println();

    }
}
