import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int time = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int[] arr = new int[time];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < time; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (goal == sum) {
                        max = sum;
                    }
                    if (max < sum && sum < goal) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
