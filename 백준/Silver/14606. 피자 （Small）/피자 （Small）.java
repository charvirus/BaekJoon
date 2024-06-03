import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        arr[2] = 1;
        for (int i = 3; i <= N; i++) {
            arr[i] = i-1+arr[i-1];
        }
        System.out.println(arr[N]);
    }
}