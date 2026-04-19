import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        StringBuilder aa = new StringBuilder();
        StringBuilder bb = new StringBuilder();
        aa.append(a.repeat(b.length()));
        bb.append(b.repeat(a.length()));
        if (aa.compareTo(bb) == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
