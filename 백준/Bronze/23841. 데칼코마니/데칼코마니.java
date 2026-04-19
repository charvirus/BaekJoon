import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        char[][] board = new char[y][x];

        for (int i = 0; i < y; i++) {
            board[i] = br.readLine().toCharArray();
        }
        int half = board[0].length / 2;

        for (int i = 0; i < y; i++) {
            StringBuilder f = new StringBuilder();
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < half; j++) {
                char fchar = board[i][j];
                char bchar = board[i][x - 1 - j];
                if (fchar != bchar) {
                    if (fchar == '.') {
                        f.append(bchar);
                        b.insert(0, bchar);
                    } else if (bchar == '.') {
                        f.append(fchar);
                        b.insert(0, fchar);
                    }
                } else {
                    f.append(fchar);
                    b.insert(0, fchar);
                }
            }
            sb.append(f).append(b).append("\n");
        }

        System.out.println(sb);
    }
}