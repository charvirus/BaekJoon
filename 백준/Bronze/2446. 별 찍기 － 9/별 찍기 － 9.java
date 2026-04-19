import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int d = Integer.parseInt(br.readLine());

        for (int i = 0; i < d * 2 - 1; i++) {
            if (i < d) {
                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                }
                for (int j = i * 2; j < d * 2 - 1; j++) {
                    sb.append("*");
                }
            } else {
                for (int j = i + 1; j < d * 2 - 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * (i - d + 1) + 1; j++) {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
