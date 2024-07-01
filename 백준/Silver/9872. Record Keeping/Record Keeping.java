import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> cows = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String[] arr = new String[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = st.nextToken();
            }
            Arrays.sort(arr);
            String inp = "";
            for (int j = 0; j < 3; j++) {
                inp += arr[j];
            }
            cows.put(inp, cows.getOrDefault(inp, 0) + 1);
            max = Math.max(cows.get(inp),max);
        }
        System.out.println(max);
    }
}