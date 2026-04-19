import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum = 0;
            int idx = 0;
            while (st.hasMoreTokens()) {
                int inp = Integer.parseInt(st.nextToken());
                sum += inp;
                arr[idx++] = inp;
            }
            double avg = (double) sum / N;
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if(arr[j] > avg){
                    cnt++;
                }
            }

            String result = String.format("%.3f", ((double)cnt/N) * 100) + "%\n";
            sb.append(result);
        }
        System.out.println(sb);
    }

}