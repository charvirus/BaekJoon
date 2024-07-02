
import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int[] permutation = new int[8];
    static boolean[] visited = new boolean[8];
    static double ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        permutation(0);
        System.out.println(ans/20);
    }

    static void permutation(int cnt) {
        if (cnt == 8) {
            int aTeam = arr[permutation[0]] + arr[permutation[1]];
            int bTeam = arr[permutation[2]] + arr[permutation[3]] ;
            int cTeam = arr[permutation[4]] + arr[permutation[5]] ;
            int dTeam = arr[permutation[6]] + arr[permutation[7]];
            double satis1 =Math.abs((aTeam - bTeam));
            double satis2 =Math.abs((cTeam - dTeam));
            ans = Math.max(ans, Math.min(20-satis1, 20-satis2));
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }
        }
    }
}