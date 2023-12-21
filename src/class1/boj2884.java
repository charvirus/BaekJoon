package class1;

import java.io.*;
import java.util.StringTokenizer;

public class boj2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        M -= 45;

        if (M < 0) {
            M = 60 + M;
            H--;
            if (H < 0) {
                H = 23;
            }
        }

        bw.write(H+" "+M);
        bw.flush();
    }
}
