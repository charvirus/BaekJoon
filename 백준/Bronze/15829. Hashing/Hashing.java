import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long prime = 1234567891;
        long r = 1;
        long sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += ((str.charAt(i) - 'a' + 1) * r) % prime;
            r = ((r * 31) % prime);

        }

        bw.write(sum % prime + "");
        bw.flush();
        bw.close();

    }
}