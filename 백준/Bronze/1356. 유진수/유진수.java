import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans = "NO";
        String inp = br.readLine();
        if (inp.length() > 1) {
            for (int i = 1; i <= inp.length(); i++) {
                int a = 1;
                int b = 1;
                for (int j = 0; j < i; j++) {
                    a *= inp.charAt(j) - '0';
                }
                for (int j = i; j < inp.length(); j++) {
                    b *= inp.charAt(j) - '0';
                }
                if (a == b) {
                    ans = "YES";
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}