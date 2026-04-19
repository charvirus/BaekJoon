import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        String M = st.nextToken();

        int n  = Integer.parseInt(new StringBuilder(N).reverse().toString());
        int m  = Integer.parseInt(new StringBuilder(M).reverse().toString());
        System.out.println(n > m ? n : m);
    }
}