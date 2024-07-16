import java.io.*;

public class Main {
    static boolean[] prime = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setPrime();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int inp = Integer.parseInt(br.readLine());
            checkPrime(inp);
        }
    }

    static void setPrime() {
        for (int i = 2; i <= 1000; i++) {
            for (int j = i + i; j <= 1000; j += i) {
                prime[j] = true;
            }
        }
    }

    static int checkPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2; j <= n; j++) {
                    if (!prime[j]) {
                        for (int k = 2; k <= n; k++) {
                            if (!prime[k]) {
                                if (i + j + k == n) {
                                    System.out.println(i + " " + j + " " + k);
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(0);
        return 0;
    }
}