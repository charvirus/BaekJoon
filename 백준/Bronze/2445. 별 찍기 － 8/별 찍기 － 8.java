import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inp * 2 - 1; i++) {
            if (i < inp) {
                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }
                for (int j = 0; j < (inp - i - 1) * 2; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }
            } else {
                for (int j = inp - 1; j > i - inp; j--) {
                    sb.append("*");
                }
                for (int j = 0; j < (i - inp + 1) * 2; j++) {
                    sb.append(" ");
                }
                for (int j = inp - 1; j > i - inp; j--) {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}