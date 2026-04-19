import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inp = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while (inp != 0) {
            arr[inp % 10]++;
            inp /= 10;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i] != 0) {
                sb.append(i);
                arr[i]--;
            }
        }
        System.out.println(sb);
    }

}
