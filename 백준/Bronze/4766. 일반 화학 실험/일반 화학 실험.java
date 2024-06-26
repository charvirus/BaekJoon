import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double before = -9999.0;
        while (true) {
            String inp = br.readLine();
            if (inp.equals("999")) {
                break;
            }
            double dinp = Double.parseDouble(inp);
            if (before != -9999.0) {
                sb.append(String.format("%.2f\n",dinp - before));
            }
            before = dinp;
        }
        System.out.print(sb);
    }
}