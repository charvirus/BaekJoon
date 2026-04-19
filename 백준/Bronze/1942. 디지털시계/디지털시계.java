import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] se = new int[2];
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                String inp = st.nextToken();
                StringTokenizer time = new StringTokenizer(inp, ":");
                se[j] = Integer.parseInt(time.nextToken()) * 10000 + Integer.parseInt(time.nextToken()) * 100 + Integer.parseInt(time.nextToken());
            }
            if (se[0] > se[1]) {
                se[1] += 240000;
            }
            while (se[0] <= se[1]) {
                if (se[0] % 3 == 0) {
                    cnt++;
                    se[0] += 3;
                    if (se[0] % 100 > 59) {
                        se[0] -= se[0] % 100;
                        se[0] += 100;
                    }
                    if (se[0] / 1000 >= 6 && se[0] % 10000 >=6000) {
                        se[0] += 10000;
                        se[0]-=6000;
                    }
                }else{
                    se[0]++;
                }
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb);
    }
}