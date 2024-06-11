import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int inp = Integer.parseInt(br.readLine());
            int cnt = 0;
            while (inp >= 5) {
                cnt += inp / 5;
                inp /= 5;
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}