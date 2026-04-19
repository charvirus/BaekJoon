import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int half = Math.max(a, b) / 2;
        boolean flag = false;
        for (int i = 1; i <= half; i++) {
            if (flag) {
                break;
            }
            for (int j = 1; j <= half; j++) {
                if (i * j == a + b && (i - 2) * (j - 2) == b) {
                    System.out.println(j + " " + i);
                    flag = true;
                    break;
                }
            }
        }
    }
}

