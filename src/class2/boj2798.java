package class2;

import java.io.*;
import java.util.StringTokenizer;

// 블랙잭
public class boj2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cnt = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int diff = 0;

        int[] inp = new int[cnt];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < cnt; i++) {
            inp[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cnt - 2; i++) {
            for (int j = i + 1; j < cnt - 1; j++) {
                for (int k = j + 1; k < cnt; k++) {
                    int sum = inp[i] + inp[j] + inp[k];
                    if (sum == goal) {
                        diff = sum;
                    }
                    // 차이가 적으면 갱신함
                    if (diff < sum && sum < goal) {
                        diff = sum;
                    }
                }
            }
        }
        System.out.println(diff);
    }
}
