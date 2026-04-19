import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int j = 0; j < N; j++) {
            int ans = 0;
            st = new StringTokenizer(br.readLine(), " ");
            Long l = Long.parseLong(st.nextToken()) - 1;
            Long r = Long.parseLong(st.nextToken());
            long ansLeft = (l / 9) * 45;
            long resLeft = l % 9;
            for (int i = 1; i <= resLeft; i++) {
                ansLeft += i;
            }
            long ansRight = (r / 9) * 45;
            ;
            long resRight = r % 9;
            for (int i = 1; i <= resRight; i++) {
                ansRight += i;
            }

            sb.append(ansRight - ansLeft + "\n");
        }
        System.out.print(sb);
    }
}
// https://oj.uz/submission/976315 이 코드 참조함