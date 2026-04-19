import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        int[][] list = new int[cnt][2];

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cnt; i++) {
            int rank = 1;

            for (int j = 0; j < cnt; j++) {
                if (i == j) continue;
                if (list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }

}