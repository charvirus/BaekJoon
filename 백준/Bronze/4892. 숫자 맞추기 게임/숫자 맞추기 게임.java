import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        while (true) {
            ++prev;
            int n0 = Integer.parseInt(br.readLine());
            if (n0 == 0) {
                break;
            }
            sb.append(prev+". ");
            int n1 = n0 * 3;
            int n2 = 0;
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
                sb.append("even ");
            } else {
                n2 = (n1 + 1) / 2;
                sb.append("odd ");
            }
            int n3 = 3 * n2;
            sb.append(n3/9+"\n");
        }
        System.out.println(sb);
    }
}