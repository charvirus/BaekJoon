import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BigInteger sum = BigInteger.ONE;
        BigInteger div = BigInteger.ONE;

        for (int i = 0; i < b; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(a - i)));
            div = div.multiply(new BigInteger(String.valueOf(i + 1)));
        }

        System.out.println(sum.divide(div));
    }
}