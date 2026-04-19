import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        int ot = 0;
        if ((i % 100 != 0 || i % 400 == 0) && i % 4 == 0) {
            ot = 1;
        }
        System.out.println(ot);
    }
}