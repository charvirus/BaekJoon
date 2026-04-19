import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int chk = 1;
        for (int i = 0; i < inp.length() / 2; i++) {
            if (inp.charAt(i) != inp.charAt(inp.length() - 1 - i)) {
                chk = 0;
            }
        }
        System.out.println(chk);
        br.close();
    }
}