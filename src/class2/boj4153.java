package class2;

import java.io.*;
import java.util.StringTokenizer;

public class boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                // 어느것이 빗면인지 몰라 경우의 수를 생각해야함
                if ((a * a) + (b * b) == c * c) {
                    bw.write("right\n");
                } else if ((a * a) == (b * b) + c * c) {
                    bw.write("right\n");
                } else if ((a * a) + (c * c) == (b * b)) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }
        }
        br.close();
        bw.flush();
    }
}
