import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans = "";
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        double minDistance = Double.MAX_VALUE;
        double distance = 0.0;
        int[][] coor = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            coor[i][0] = Integer.parseInt(st.nextToken());
            coor[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                distance = Math.sqrt(Math.pow(coor[i][0] - coor[j][0], 2) + Math.pow(coor[i][1] - coor[j][1], 2));
                if (minDistance > distance) {
                    minDistance = distance;
                    ans = (i + 1) + " " + (j + 1);
                }
            }
        }
        System.out.println(ans);
    }
}