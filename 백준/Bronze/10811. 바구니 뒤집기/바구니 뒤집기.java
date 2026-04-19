import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken()) - 1;
            for (int j = n; j <= m; j++) {
                int nn = m--;
                int temp = basket[nn];
                basket[nn] = basket[j];
                basket[j] = temp;
            }
        }
        br.close();
        for (int j : basket) {
            System.out.print(j + " ");
        }
    }
}