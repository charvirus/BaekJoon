import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int time = Integer.parseInt(st.nextToken());
        int iter = Integer.parseInt(st.nextToken());
        int[] arr = new int[time];
        st = new StringTokenizer(br.readLine(), ",");
        for (int i = 0; i < time; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (iter-- > 0) {
            time--;
            for (int i = 0; i < time; i++) {
                arr[i] = arr[i + 1] - arr[i];
            }
        }
        for (int i = 0; i < time - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[time - 1] );
    }
}