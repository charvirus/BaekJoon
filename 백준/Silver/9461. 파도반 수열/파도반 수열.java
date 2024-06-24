import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] arr = new long[101];
        int T = Integer.parseInt(br.readLine());
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            for (int j = 5; j <= N; j++) {
                arr[j] = arr[j - 1] + arr[j - 5];
            }
            sb.append(arr[N-1]+"\n");
        }
        System.out.println(sb);

    }
}