import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oct.length(); i++) {
            String number = Integer.toBinaryString(oct.charAt(i) - '0');
            if (number.length() == 2 && i != 0) {
                number = "0" + number;
            } else if (number.length() == 1 && i != 0) {
                number = "00" + number;
            }
            sb.append(number);
        }

        System.out.println(sb);
    }
}