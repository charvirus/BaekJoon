import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((int)Math.pow(Math.pow(2,inp)+1,2));
    }
}
