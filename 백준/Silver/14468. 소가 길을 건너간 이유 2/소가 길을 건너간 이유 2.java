import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] start = new int[26];
        int[] end = new int[26];
        int cnt = 0;
        String inp = br.readLine();
        for (int i = 0; i < inp.length(); i++) {
            int idx = inp.charAt(i) - 'A';
            if (start[idx] == 0) {
                start[idx] = i + 1;
            } else {
                end[idx] = i + 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (start[i] < start[j] && start[j] < end[i] && end[i] < end[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}