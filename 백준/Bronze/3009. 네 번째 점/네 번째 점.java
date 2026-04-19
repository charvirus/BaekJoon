import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];

        int xx;
        int yy;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        if (x[1] == x[2]) {
            xx = x[0];
        } else {
            xx = (x[0] == x[1] ? x[2] : x[1]);
        }

        if (y[1] == y[2]) {
            yy = y[0];
        } else {
            yy = (y[0] == y[1] ? y[2] : y[1]);
        }

        System.out.println(xx + " " + yy);
    }
}
