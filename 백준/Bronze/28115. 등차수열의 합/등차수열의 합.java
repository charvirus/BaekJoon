import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int time = Integer.parseInt(br.readLine());
        arr = new int[time];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < time; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (check(arr)) {
            System.out.println("YES");
            for (int i = 0; i < time; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < time; i++) {
                System.out.print("0 ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }

    }

    static boolean check(int[] a) {
        int length = a.length;
        for (int i = 2; i < length; i++) {
            if (a[i] - a[i - 1] != a[1] - a[0]) return false;
        }
        return true;
    }
}