package class1;

import java.io.*;

public class boj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine())%42]++;
        }
        br.close();

        for (int j : arr) {
            if (j != 0) {
                cnt++;
            }
        }
        bw.write(cnt+"");
        bw.flush();
    }
}

