import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] arr = new int[2][2];
        int yy = 0;
        int xx;

        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xx = 0;
            for (int j = 0; j < x; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    arr[yy][xx] = j;
                    xx++;
                    arr[yy][xx] = i;
                    yy++;
                }
            }
        }

        xx = Math.abs(arr[0][0] - arr[1][0]);
        yy = Math.abs(arr[1][1] - arr[0][1]);
        System.out.println(xx+yy);
    }
}