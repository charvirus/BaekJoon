import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        StringBuilder sb = new StringBuilder();
        int inplength = inp.length();
        if (inp.charAt(0) == '"' && inp.charAt(inplength - 1) == '"') {
            if (inp.length() == 2) {
                sb.append("CE");
            } else {
                String cut = inp.substring(1);
                if (inp.length() == 1) {
                    sb.append("CE");
                } else {
                    sb.append(cut, 0, cut.length() - 1);
                }
            }
        } else {
            sb.append("CE");
        }
        System.out.println(sb);
    }

}