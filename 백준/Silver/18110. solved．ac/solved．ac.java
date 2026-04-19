import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double avg = 0;
        int percent = (int) round(cnt * 0.15);
        for (int i = percent; i < cnt - percent; i++) {
            avg += arr[i];
        }
        System.out.println((int) round(avg / (cnt - percent * 2)));
    }
}