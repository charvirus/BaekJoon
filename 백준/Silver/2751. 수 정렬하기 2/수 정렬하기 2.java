import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[2000001];
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append((i - 1000000) + "\n");
            }
        }
        System.out.println(sb);
    }

}
