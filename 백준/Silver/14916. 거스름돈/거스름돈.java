import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        for (int i = 0; i <= N; i++) {
            arr[i] = -1;
        }
        arr[2] = 1;
        arr[4] = 2;
        arr[5] = 1;
        for (int i = 5; i <= N; i++) {
            if (arr[i - 2] != -1) {
                arr[i] = arr[i - 2] + 1;
            }
            if (arr[i - 5] != -1 && i > 5) {
                arr[i] = Math.min(arr[i], arr[i-5] + 1);
            }
        }
        System.out.println(arr[N]);
    }
}