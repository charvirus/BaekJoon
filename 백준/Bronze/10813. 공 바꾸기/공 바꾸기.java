import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for(int i = 0;i<basket.length;i++){
            basket[i] = i+1;
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int temp;
            temp = basket[n-1];
            basket[n-1] = basket[m-1];
            basket[m-1] = temp;
        }
        br.close();
        for (int j : basket) {
            System.out.print(j + " ");
        }
    }
}