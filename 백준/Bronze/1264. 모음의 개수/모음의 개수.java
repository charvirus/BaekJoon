import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String inp = br.readLine();
            if (Objects.equals(inp, "#")) {
                break;
            }
            int cnt = 0;
            for (int i = 0; i < inp.length(); i++) {
                if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u'
                ||inp.charAt(i) == 'A' || inp.charAt(i) == 'E' || inp.charAt(i) == 'I' || inp.charAt(i) == 'O' || inp.charAt(i) == 'U') {
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

}