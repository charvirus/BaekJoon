import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] val = new int[6];

        for (int i = 0; i < val.length; i++) {
            val[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (val[0] * i + val[1] * j == val[2] && val[3] * i + val[4] * j == val[5]){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}