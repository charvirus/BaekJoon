import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[][] arr = new int[1004][1004];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;

        for (int i = 2; i < 1004; i++) {
            for (int j = 1; j < i + 1; j++) {
                arr[i][0] = 1;
                arr[i][i] = 1;
                arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
            }
        }

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(arr[a][b]%10007);
    }
}