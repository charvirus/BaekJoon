import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        boolean[][] check = new boolean[N][N];
        int[] student = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < M; k++) {
                student[k] = Integer.parseInt(st.nextToken());
            }
            boolean B = Integer.parseInt(br.readLine()) == 1;
            if (B) {
                for (int j = 0; j < M; j++) {
                    check[i][student[j] - 1] = true;
                }
            } else {
                for (int j = 0; j < N; j++) {
                    check[i][j] = true;
                }
                for (int j = 0; j < M; j++) {
                    check[i][student[j] - 1] = false;
                }
            }
        }
        student = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (check[j][i]) {
                        student[i]++;
                    }
                }
                else {
                    if (!check[j][i]) {
                        student[i]++;
                    }
                }
            }
            if (student[i] == N) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("swi");
        } else {
            for (int i = 0; i < N; i++) {
                if (student[i] == N) {
                    System.out.print(1+i+" ");
                }
            }
        }
    }
}