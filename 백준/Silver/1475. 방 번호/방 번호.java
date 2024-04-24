import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inp = br.readLine();
        inp = inp.replace('9', '6');
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < inp.length(); i++) {

            arr[inp.charAt(i) - '0']++;
        }
        arr[6] = arr[6] / 2 + arr[6] % 2;
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}