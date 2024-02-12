package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8001];

        int A = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;
        for (int i = 0; i < A; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            arr[val + 4000]++;
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        int count = 0;
        int mode_max = 0;
        boolean flag = false;

        for (int i = 4000 + min; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                // 중앙값을 찾는 코드
                if (count < (A + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }
                // 최빈값을 찾는 코드
                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (mode_max == arr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / A));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
