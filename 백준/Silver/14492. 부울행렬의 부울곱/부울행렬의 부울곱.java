import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int inp = Integer.parseInt(br.readLine());
        int cnt = 0;
        boolean[][] a = new boolean[inp][inp];
        boolean[][] b = new boolean[inp][inp];
        boolean[][] c = new boolean[inp][inp];

        for (int j = 0; j < inp; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < inp; k++) {
                if (st.nextToken().equals("1")) {
                    a[j][k] = true;
                }
            }
        }
        for (int j = 0; j < inp; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < inp; k++) {
                if (st.nextToken().equals("1")) {
                    b[j][k] = true;
                }
            }
        }

        for (int i = 0; i < inp; i++) {
            for (int j = 0; j < inp; j++) {
                for (int k = 0; k < inp; k++) {
                    c[i][j] |= (a[i][k] && b[k][j]);
                    if(c[i][j]){
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}