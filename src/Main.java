import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long fibo[] = new long[100];
    public static void main(String[] args) throws IOException {
        setFibo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int k = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            System.out.println(checkFibo(k, x) ? "YES" : "NO");
        }
    }

    static boolean checkFibo(int k, long x) {
        if (k == 1) {
            for (int i = 1; i < 100; i++) {
                if (x == fibo[i]) {
                    return true;
                }
            }
        } else if (k == 2) {
            for (int i = 1; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
                    if (x == fibo[i] + fibo[j]) {
                        return true;
                    }
                }
            }
        } else {
            for (int i = 1; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
                    for (int l = 1; l < 100; l++) {
                        if (x == fibo[i] + fibo[j] + fibo[l]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static void setFibo() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 100; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
}