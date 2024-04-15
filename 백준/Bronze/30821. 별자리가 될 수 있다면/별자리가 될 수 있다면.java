import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 0; i < 5; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
        }

        System.out.println(result.divide(BigInteger.valueOf(120)));
    }


}