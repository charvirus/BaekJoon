package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10815 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (binarySearch(num)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }

    private static boolean binarySearch(int num) {
        int lIndex = 0;
        int rIndex = n - 1;
        while (lIndex <= rIndex) {
            int midIndex = (lIndex + rIndex) / 2;
            int mid = arr[midIndex];

            if (num < mid) {
                rIndex = midIndex - 1;
            } else if (num > mid) {
                lIndex = midIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
