import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String inp = br.readLine();
            sb.append(inp.charAt(inp.length()/2-1) == inp.charAt(inp.length()/2) ? "Do-it":"Do-it-Not");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}