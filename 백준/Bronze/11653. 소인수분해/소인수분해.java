import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inp = Integer.parseInt(br.readLine());
        int i = 2;
        while (inp != 1) {
            if (inp % i == 0) {
                sb.append(i + "\n");
                inp /= i;
                i = 2;
            } else {
                i++;
            }
        }
        System.out.println(sb);
    }
}
