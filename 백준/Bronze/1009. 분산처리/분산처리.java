import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        int r;
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            r = 1;
            for (int j = 0; j < b; j++) r = (r * a) % 10;
            if(r==0) r = 10;
            sb.append(r).append("\n");
        }
        System.out.println(sb);
    }
}