import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inp = Integer.parseInt(br.readLine());
        final int Q = 25;
        final int D = 10;
        final int N = 5;
        final int P = 1;
        for (int i = 0; i < inp; i++) {
            int exch = Integer.parseInt(br.readLine());

            sb.append(exch / Q).append(" ");
            exch %= Q;
            sb.append(exch / D).append(" ");
            exch %= D;
            sb.append(exch / N).append(" ");
            exch %= N;
            sb.append(exch / P).append("\n");
        }
        System.out.println(sb);
    }
}