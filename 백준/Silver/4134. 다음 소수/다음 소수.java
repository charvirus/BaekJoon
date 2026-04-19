import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long cnt = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < cnt; i++) {
            long inp = Long.parseLong(br.readLine());
            if (inp <= 2) {
                sb.append(2).append("\n");
                continue;
            }
            while (true) {
                if (chkPrime(inp)) {
                    sb.append(inp).append("\n");
                    break;
                } else {
                    inp++;
                }
            }
        }
        System.out.println(sb);
    }

    static boolean chkPrime(long a) {
        long sqrt = (long) Math.sqrt(a);
        for (int i = 2; i <= sqrt; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}