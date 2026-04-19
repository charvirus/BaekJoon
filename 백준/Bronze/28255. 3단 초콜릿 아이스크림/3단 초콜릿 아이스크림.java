import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time; i++) {
            String inp = br.readLine();
            String s = inp.substring(0, (int) Math.ceil(inp.length() / 3.0));
            String rev = rev(s);
            String tail = tail(s);
            String tailRev = tail(rev(s));

            if(inp.equals(s + rev + s) || inp.equals(s + tailRev + s) || inp.equals(s + rev + tail) || inp.equals(s  + tailRev+ tail)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    static String rev(String s) {
        StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    static String tail(String s) {
        return s.substring(1, s.length());
    }


}