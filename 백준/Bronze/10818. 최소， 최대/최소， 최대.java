import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int i = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int j ;
        for (int k = 0; k < i; k++) {
            j = Integer.parseInt(st.nextToken());
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }

        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}