import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0){
                sb.append(i).append('\n');
                arr[i]--;
            }
        }System.out.println(sb);
    }
}