import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ip = Integer.parseInt(br.readLine());

        int cnt = 1;
        int sub = 0;
        while (ip > 0) {
            if (ip == 1) {
                break;
            }
            cnt++;
            if (cnt > 2) {
                sub -= 6;
                ip += sub;
            }
            ip -= 6;
        }
        bw.write("" + cnt);
        br.close();
        bw.flush();
    }
}