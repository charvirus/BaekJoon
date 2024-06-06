import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        while (x * y < N) {
            if (x < y) {
                x++;
            }else{
                y++;
            }
        }
        System.out.println(x + " " + y);
    }
}