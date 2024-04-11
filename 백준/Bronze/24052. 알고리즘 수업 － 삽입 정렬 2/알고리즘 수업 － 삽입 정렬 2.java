import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 1; i < N; i++) {

            int idx = i - 1;
            int newItem = arr[i];

            while (0 <= idx && newItem < arr[idx]) {
                arr[idx + 1] = arr[idx];
                idx--;
                cnt++;
                if (cnt == K) {
                    printArr(arr);
                    return;
                }
            }
            if (idx + 1 != i) {
                arr[idx + 1] = newItem;
                cnt++;
            }
            if (cnt == K) {
                printArr(arr);
                return;
            }
        }
        System.out.println(-1);
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}