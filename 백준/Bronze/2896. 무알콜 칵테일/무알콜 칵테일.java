import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] amount = new int[3];
        for (int i = 0; i < 3; i++) {
            amount[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int[] ratio = new int[3];
        for (int i = 0; i < 3; i++) {
            ratio[i] = Integer.parseInt(st.nextToken());
        }

        double minDiv = Double.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            if (minDiv > (double) amount[i] / ratio[i]) {
                minDiv = (double) amount[i] / ratio[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            double result = amount[i] - (ratio[i] * minDiv);
            
                System.out.printf("%.6f ", result);
            
        }
    }
}