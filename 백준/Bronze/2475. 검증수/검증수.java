import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        int[] arr = new int[5];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = Integer.parseInt(strs[j]);
        }

        System.out.println(method(arr));
    }

    private static int method(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += arr[i] * arr[i];
        }
        return j % 10;
    }
}