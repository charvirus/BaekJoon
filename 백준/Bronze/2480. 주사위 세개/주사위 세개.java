import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;
        if (max < a) {
            max = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        if (a == b && b == c) {
            System.out.println((a * 1000) + 10000);
        } else if (a == b || a == c) {
            System.out.println((a * 100) + 1000);
        } else if (b == c) {
            System.out.println((b * 100) + 1000);
        } else {
            System.out.println(max * 100);
        }
    }
}