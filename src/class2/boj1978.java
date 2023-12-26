package class2;

import java.io.*;
import java.util.StringTokenizer;
//소수 찾기
public class boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int prime = 0;

        while(st.hasMoreTokens()) {
            boolean isprime = true;
            int ip = Integer.parseInt(st.nextToken());
            if(ip == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(ip); j++) {
                if (ip % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                prime++;
            }
        }
        System.out.println(prime);
        br.close();
        bw.flush();
    }
}
