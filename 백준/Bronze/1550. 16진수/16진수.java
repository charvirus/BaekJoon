import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();
        int output = 0;
        for (int i = 0; i < oct.length(); i++) {
            int pow = (int) Math.pow(16, i);
            int charr = 0;
            if ('0' <= oct.charAt(oct.length() - 1 - i) && oct.charAt(oct.length() - 1 - i) <= '9') {
                charr = oct.charAt(oct.length() - 1 - i) - '0';
            }else{
                charr = oct.charAt(oct.length() - 1 - i) - 55;
            }
            output += pow * charr;

        }
        System.out.println(output);
    }
}