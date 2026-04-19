import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] wand = new int[N];
        int[] box = new int[N];
        boolean flag = false;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            wand[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wand);
        Arrays.sort(box);
        for (int i = 0; i < N; i++) {
            if (wand[i] > box[i]) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "NE" : "DA");
    }
}