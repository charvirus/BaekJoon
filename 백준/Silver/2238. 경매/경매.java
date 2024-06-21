import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int min = 10001;
        int[] priceList = new int[U + 1];
        String[] nameList = new String[U + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());

            if (nameList[price] == null) {
                nameList[price] = name;
            }
            priceList[price]++;
        }
        for (int i = 1; i <= U; i++) {
            if (priceList[i] != 0) {
                min = Math.min(priceList[i], min);
            }
        }

        for (int i = 1; i <= U; i++) {
            if (min == priceList[i]) {
                System.out.println(nameList[i] + " " + i);
                break;
            }
        }
    }
}