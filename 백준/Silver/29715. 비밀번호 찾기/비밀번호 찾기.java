import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int pwCnt = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                cnt++;
            } else {
                pwCnt++;
            }
        }
        N -= pwCnt;
        int result = 1;
        if (cnt > 0) {
            result *= comb(N, cnt) * factorial(cnt);
        }
        N -= cnt;
        if (N > 0) {
            result *= (comb(9 - (pwCnt + cnt), N) * factorial(N));
        }

        System.out.println(result * X + (result - 1) / 3 * Y);
    }

    static int comb(int a, int b) {
        int result = 1;
        result = factorial(a) / (factorial(a - b) * factorial(b));
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}