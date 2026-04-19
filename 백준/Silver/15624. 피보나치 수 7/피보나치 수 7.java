import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] fibonacci = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= inp; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 1000000007;
        }

        System.out.println(fibonacci[inp]);
    }
}