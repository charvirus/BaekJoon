import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int inp = Integer.parseInt(br.readLine());
            if (inp == 0) {
                break;
            }
            int cnt = 0;
            for (int i = inp + 1; i <= inp * 2; i++) {
                if (chkPrime(i)) {
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    static boolean chkPrime(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}