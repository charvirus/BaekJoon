import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 1;
        for (int i = 4; i <= inp; i++) {
            arr[i] = Math.min(arr[i - 1], arr[i - 3]) + 1;
        }
        if (arr[inp] % 2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}