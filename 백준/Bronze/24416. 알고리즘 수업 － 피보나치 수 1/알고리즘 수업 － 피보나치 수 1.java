import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    static int[] fibArr = new int[41];
    static int fibCnt = 1;
    static int fibonacciCnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        fib(R);
        fibonacci(R);
        System.out.println(fibCnt+" "+fibonacciCnt);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            fibCnt++;
            return (fib(n - 1) + fib(n - 2));
        }
    }

    static int fibonacci(int n) {
        fibArr[1] = fibArr[2] = 1;
        for (int i = 3; i < n; i++) {
            fibonacciCnt++;
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        return fibArr[n];
    }
}
