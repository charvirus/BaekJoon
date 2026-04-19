import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inp = Integer.parseInt(br.readLine());
        for (int i = 0; i < inp; i++) {
            int num = Integer.parseInt(br.readLine());
            if ((num + 1) % (num% 100) == 0) {
                sb.append("Good");
            } else {
                sb.append("Bye");
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }

}