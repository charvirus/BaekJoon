import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = Integer.parseInt(br.readLine());
            if (a == -1) {
                break;
            }
            sb.append(a);
            ArrayList<Integer> arl = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    arl.add(i);
                    sum += i;
                }
            }

            if (sum == a) {
                sb.append(" = ");
                for (int i = 0; i < arl.size() - 1; i++) {
                    sb.append(arl.get(i) + " + ");
                }
                sb.append(arl.get(arl.size() - 1));
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
