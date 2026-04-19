import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[cnt];
        int high = 0;
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(high<arr[i]){
                high = arr[i];
            }
            sum += arr[i];
        }
        System.out.println((((double) sum /high)*100.0)/cnt);

        bw.flush();
        bw.close();

    }
}