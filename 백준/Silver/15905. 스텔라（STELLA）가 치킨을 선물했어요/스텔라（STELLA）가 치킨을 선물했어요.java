import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int cnt = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return  p1[1] - p2[1];
            } else {
                return p2[0] - p1[0];
            }
        });
        int fthIdx = arr[4][0];
        int fthScore = arr[4][1];
        for(int i = 4;i<N;i++){
            if(fthIdx==arr[i][0] && fthScore<arr[i][1]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}