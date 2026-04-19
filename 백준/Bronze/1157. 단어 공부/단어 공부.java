import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[(int) str.charAt(i) - 65]++;
        }

        int max = -1;
        char ans = '?';

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                ans = (char) (j + 65);
            } else if (arr[j] == max) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}