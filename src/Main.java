import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = 0;
    static int totalcnt = 0;
    static int y;
    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        String[][] arr = new String[y][x];

        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < x; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        checkXY(arr);

        System.out.println(totalcnt - max);
    }

    static void checkXY(String[][] arr) {
        for (int i = 0; i < y; i++) {
            int cnt = 0;
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < arr[i][j].length(); k++) {
                    if (arr[i][j].charAt(k) == '9') {
                        cnt++;
                        totalcnt++;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }

        for (int i = 0; i < x; i++) {
            int cnt = 0;
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < arr[j][i].length(); k++) {
                    if (arr[j][i].charAt(k) == '9') {
                        cnt++;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }


    }
}