import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int x = 1, y = 1;


        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int inp = Integer.parseInt(st.nextToken());
                if (inp > max) {
                    max = inp;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        br.close();

        System.out.println(max);
        System.out.println(x+" "+y);
    }
}