import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int sta = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            for (int s = sta-1; s <= en-1; s++) {
                basket[s] = num;
            }
        }
        for(int i = 0;i<basket.length;i++){
            System.out.print(basket[i]+" ");
        }
        System.out.println();
        br.close();
    }
}