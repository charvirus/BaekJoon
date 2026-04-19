import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int cnt = 0;
            int idx = 0;
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 6; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            while (cnt < N) {
                int dice = arr[idx % 6];
                int next = cnt + dice;
                if (next <= N) {
                    cnt = next;
                    sum += cnt;
                }
                idx++;
            }
            System.out.println(sum);
        }
    }
}