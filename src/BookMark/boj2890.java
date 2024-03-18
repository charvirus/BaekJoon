package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] rank = new int[9];
        int[] answer = new int[9];
        int num = 0, max = 0, order = 1;
        boolean flag = false;

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 1; j < C - 1; j++) {
                if (!(str.charAt(j) == '.')) {
                    num = Integer.parseInt(String.valueOf(str.charAt(j))) - 1;
                    rank[num] = j;
                    if (max < j) {
                        max = j;
                    }
                    break;
                }
            }
        }
        while (max > 0) {
            flag = false;
            for (int i = 0; i < 9; i++) {
                if (rank[i] == max) {
                    answer[i] = order;
                    flag = true;
                }
            }
            max--;
            if (flag) {
                order++;
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(answer[i]);
        }
    }
}
