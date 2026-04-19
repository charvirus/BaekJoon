import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] square = new int[100][100];
        int inp = Integer.parseInt(br.readLine());
        int area = 0;

        for (int i = 0; i < inp; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int k = 0; k < 10; k++) {
                for (int j = 0; j < 10; j++) {
                    if (square[y + k][x + j] == 0) {
                        square[y + k][x + j] = 1;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);

    }
}