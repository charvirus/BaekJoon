import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(br.readLine());

        for (int k = 0; k < i; k++) {
            String ip = br.readLine();
            ip = ip.toUpperCase();
            sb.append(ip.charAt(0)).append(ip.charAt(ip.length() - 1)).append("\n");
        }

        System.out.println(sb);
    }
}