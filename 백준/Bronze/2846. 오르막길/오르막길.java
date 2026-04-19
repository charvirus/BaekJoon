import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int[] arr = new int[time];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < time; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int asc = 0;
        int tmp = 0;
        for (int i = 1; i < time; i++) {
            if (arr[i - 1] < arr[i]) {
                tmp += arr[i] - arr[i - 1];
            } else {
                asc = Math.max(tmp,asc);
                tmp = 0;
            }
        }
        asc = Math.max(asc, tmp);
        System.out.println(asc);

    }
}