import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, min = arr[0];
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                answer = Math.max(answer, arr[i] - min);
                min = arr[i + 1];
            }
        }
        System.out.print(Math.max(answer, arr[n - 1] - min));
    }
}