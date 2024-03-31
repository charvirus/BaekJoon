import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        for (int i = 0; i < time; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String A = st.nextToken();
            String B = st.nextToken();
            BigInteger a = new BigInteger(A,2);
            BigInteger b = new BigInteger(B,2);

            BigInteger ans = a.add(b);
            sb.append(ans.toString(2)+"\n");
        }

        System.out.println(sb);
    }
}