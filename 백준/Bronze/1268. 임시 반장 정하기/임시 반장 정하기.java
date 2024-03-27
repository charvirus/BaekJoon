import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static int num = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][5];
        int[] classRoom = new int[N];
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            Set<Integer> sameClass = new HashSet<>();

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[i][j] == arr[k][j] && k != i) {
                        sameClass.add(k);
                    }
                }

                if (max < sameClass.size()) {
                    max = sameClass.size();
                    cnt = i;
                }
            }
        }

        System.out.println(cnt + 1);
    }
}
