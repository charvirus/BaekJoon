import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            StringBuilder cmp = new StringBuilder();
            if (Objects.equals(str, "0")) {
                break;
            } else {
                for (int i = str.length() - 1; i >= 0; i--) {
                    cmp.append(str.charAt(i));
                }

                if (str.contentEquals(cmp)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        bw.flush();
        bw.close();

    }
}