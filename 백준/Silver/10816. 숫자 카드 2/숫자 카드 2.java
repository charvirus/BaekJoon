import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] cnt = new int[20000001];
        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(st.nextToken()) + 10000000]++;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int idx = cnt[Integer.parseInt(st.nextToken()) + 10000000];
            sb.append(idx + " ");
        }
        System.out.println(sb);
    }
}