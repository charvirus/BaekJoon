import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int g = gcd(a, b);

        System.out.println(g);
        System.out.println(a * b / g);
    }

    public static int gcd(int a, int b) {
        // 최대공약수
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}