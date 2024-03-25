package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2606 {

    public static int[][] node;
    public static boolean[] infected;
    public static int M, N;
    public static int result = 0;

    public static void DFS(int x) {
        infected[x] = true;
        result++;
        for (int i = 1; i <= M; i++) {
            if (node[x][i] == 1 && !infected[i]) {
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        node = new int[M + 1][M + 1];
        infected = new boolean[M + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            node[m][n] = node[n][m] = 1;
        }

        DFS(1);

        System.out.println(result - 1);
    }
}
