import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken()) - 1;
            if (n == 0) {
                sb.append(arr[m] + "\n");
            } else {
                sb.append((arr[m] - arr[n - 1]) + "\n");
            }
        }
        System.out.print(sb);
    }
}