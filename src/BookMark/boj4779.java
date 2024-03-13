package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj4779 {

    static char[] line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String str;

        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            sb = new StringBuilder();

            int length = (int) Math.pow(3, N);

            line = new char[length];
            Arrays.fill(line, '-');

            cantorSet(0, length);
            for (int i = 0; i < length; i++) {
                sb.append(line[i]);
            }
            System.out.println(sb);
        }
        br.close();
    }

    static void cantorSet(int start, int length) {
        if (length < 3) {
            return;
        }

        for (int i = start + length / 3; i < start + length / 3 * 2; i++) {
            line[i] = ' ';
        }

        cantorSet(start, length / 3);
        cantorSet(start + length / 3 * 2, length / 3);
    }
}
