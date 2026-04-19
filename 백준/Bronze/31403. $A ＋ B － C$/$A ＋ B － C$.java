import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        sb.append(a+b-c).append("\n");
        
        String s = Integer.toString(a) + Integer.toString(b);
        sb.append(Integer.parseInt(s)-c);
        System.out.println(sb);
    }

}