import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            HashMap<String, Integer> style = new HashMap<>();
            int k = Integer.parseInt(br.readLine());
            while (k-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();

                style.put(kind, style.getOrDefault(kind, 0) + 1);

            }
            int result = 1;

            for (int val : style.values()) {
                result *= (val + 1);
            }

            sb.append(result - 1 + "\n");
        }

        System.out.println(sb);
    }
}