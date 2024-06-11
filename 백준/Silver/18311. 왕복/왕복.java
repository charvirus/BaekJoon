import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        long line = 0;
        for (int i = 0; i < N; i++) {
            line += arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        boolean flag = false;
        if (K > line) {
            K -= line;
            flag = true;
        }
        if (flag) {
            cnt = N;
            while (K > 0) {
                K -= arr[--cnt];
            }
        } else {

            while (K >= arr[cnt]) {
                K -= arr[cnt++];
            }
        }
        System.out.println(cnt + 1);
    }
}