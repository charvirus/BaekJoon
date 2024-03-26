package chococup_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] board = new boolean[51][51];
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cnt = 0, right = X, bot = Y;
            boolean isKnight = true;

            while (right >= 0 && bot >= 0) {
                for (int i = 0; i < right; ++i) {
                    for (int j = 0; j < bot; ++j) {
                        board[i][j] = isKnight;
                    }
                }
                isKnight = !isKnight;
                right -= x;
                bot -= y;
            }
            for (int i = 0; i < X; ++i) {
                for (int j = 0; j < Y; ++j) {
                    if (board[i][j]) {
                        ++cnt;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
