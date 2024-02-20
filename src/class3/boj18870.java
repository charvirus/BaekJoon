package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inp = Integer.parseInt(br.readLine());
        int[] arr = new int[inp];
        int[] sortArr = new int[inp];
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < inp; i++) {
            sortArr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortArr);

        int rnk = 0;
        for (int i : sortArr) {
            if (!integerHashMap.containsKey(i)) {
                integerHashMap.put(i, rnk);
                rnk++;
            }
        }

        for (int k : arr) {
            int rk = integerHashMap.get(k);
            sb.append(rk).append(" ");
        }

        System.out.println(sb);
    }
}
