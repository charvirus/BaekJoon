import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N <= 3) {
            System.out.println(0);
        } else {
            System.out.println((N*(N-1)*(N-2)*(N-3))/factorial(4));
        }
    }


    static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}