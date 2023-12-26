package class2;

import java.io.*;
// 분해합
public class boj2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ip = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < ip; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (i + sum == ip) {
                result = i;
                break;
            }
        }
        System.out.println(result);

        br.close();
        bw.flush();
    }
}
