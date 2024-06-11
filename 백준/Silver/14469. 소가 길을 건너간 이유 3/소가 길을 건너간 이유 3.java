import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] cow = new int[N][2];
        int time = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cow[i][0] = Integer.parseInt(st.nextToken());
            cow[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cow,(o1,o2) -> o1[0] - o2[0]);

        for (int i = 0; i < N; i++) {
            if (time < cow[i][0]) {
                time = cow[i][1]+cow[i][0];
            } else {
                time += cow[i][1];
            }
        }
        System.out.println(time);
    }
}