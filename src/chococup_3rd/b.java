package chococup_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            int inp = Integer.parseInt(br.readLine());
            if (inp == 1) {
                sb.append(0);
            } else {
                sb.append(1);
                for (int j = 0; j < inp - 2; ++j) {
                    sb.append(2);
                }
                sb.append(1);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
