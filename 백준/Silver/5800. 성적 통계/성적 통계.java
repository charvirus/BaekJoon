import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time; i++) {
            int max = -1;
            int min = 100;
            int largeGap = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cnt = Integer.parseInt(st.nextToken());
            int[] arr = new int[cnt];
            for (int j = 0; j < cnt; j++) {
                int inp = Integer.parseInt(st.nextToken());
                arr[j] = inp;
                if (max < inp) {
                    max = inp;
                }
                if (min > inp) {
                    min = inp;
                }
            }
            Arrays.sort(arr);
            for (int j = cnt - 1; j > 0; j--) {
                int gap = arr[j] - arr[j - 1];
                if (largeGap < gap) {
                    largeGap = gap;
                }
            }
            sb.append("Class " + (i + 1) + "\n");
            sb.append("Max " + max + ", Min " + min + ", Largest gap " + largeGap + "\n");
        }
        System.out.println(sb);
    }
}