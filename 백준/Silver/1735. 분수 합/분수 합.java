import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int numA = Integer.parseInt(st.nextToken());
        int denomA = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        int numB = Integer.parseInt(st.nextToken());
        int denomB = Integer.parseInt(st.nextToken());

        int num = numA * denomB + numB * denomA;
        int denom = denomA * denomB;
        int mod = gcd(num,denom);

        num /= mod;
        denom /= mod;

        System.out.println(num +" "+denom);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}