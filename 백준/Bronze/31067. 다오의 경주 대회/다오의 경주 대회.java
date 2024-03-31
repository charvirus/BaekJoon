import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean flag = false;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] >= arr[i]) {
                if (arr[i] + M <= arr[i-1]) {
                    cnt = -1;
                    break;
                }
                arr[i] += M;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}