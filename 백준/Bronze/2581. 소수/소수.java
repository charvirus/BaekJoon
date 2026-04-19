import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int min = b;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            boolean chk = true;
            if (i == 1) {
                chk = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
