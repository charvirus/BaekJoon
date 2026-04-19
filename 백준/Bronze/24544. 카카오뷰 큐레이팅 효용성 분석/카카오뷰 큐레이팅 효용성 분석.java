import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum1 = 0;
        int sum2 = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int inp = Integer.parseInt(st.nextToken());
            arr[i] = inp;
            sum1 += inp;
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int inp = Integer.parseInt(st.nextToken());
            if (inp != 1) {
                sum2 += arr[i];
            }
        }
        System.out.println(sum1 + "\n" + sum2);
    }
}