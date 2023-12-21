package class1;

import java.io.*;
import java.util.StringTokenizer;

public class boj30979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n > 0) {
            t -= Integer.parseInt(st.nextToken());
            n--;
        }
        if (t<=0){
            bw.write("Padaeng_i Happy");
        }else {
            bw.write("Padaeng_i Cry");
        }
        bw.flush();
    }
}

