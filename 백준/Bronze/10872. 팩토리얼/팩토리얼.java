import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        int sum = 1;
        for(int j = i; j >= 1; j--) {
            sum *= j;
        }
        System.out.println(sum);
    }
}