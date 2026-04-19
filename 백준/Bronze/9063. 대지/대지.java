import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int inp = Integer.parseInt(br.readLine());

        int maxX = -10000;
        int maxY = -10000;
        int minX = 10000;
        int minY = 10000;

        for (int i = 0; i < inp; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x > maxX) {
                maxX = x;
            }
            if (y > maxY) {
                maxY = y;
            }
            if (x < minX) {
                minX = x;
            }
            if (y < minY) {
                minY = y;
            }
        }
        if (inp != 0) {
            System.out.println((maxX - minX) * (maxY - minY));
        }else{
            System.out.println(0);
        }
    }
}