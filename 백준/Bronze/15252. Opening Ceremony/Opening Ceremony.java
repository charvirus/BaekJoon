import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arrA = new int[a];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < a; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < b; j++) {
                arrA[Integer.parseInt(st.nextToken()) - 1]--;
            }
            int max = 0;
            for (int j = 0; j < a; j++) {
                if (max < arrA[j]) {
                    max = arrA[j];
                }
            }
            sb.append("Data Set " + (i + 1) + ":\n");
            sb.append(max);
            if (i != N - 1) {
                sb.append("\n\n");
            }
        }

        System.out.print(sb);
    }
}