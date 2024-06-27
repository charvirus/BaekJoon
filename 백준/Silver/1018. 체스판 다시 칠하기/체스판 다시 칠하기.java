import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] arr;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr = new boolean[a][b];

        for (int i = 0; i < a; i++) {
            String inp = br.readLine();
            for (int j = 0; j < b; j++) {
                if (inp.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int chky = a - 7;
        int chkx = b - 7;

        for (int i = 0; i < chky; i++) {
            for (int j = 0; j < chkx; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean chk = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != chk) {
                    count++;
                }
                chk = !chk;
            }
            chk = !chk;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(count, min);
    }
}