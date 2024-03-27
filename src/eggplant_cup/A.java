package eggplant_cup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 10; j++) {
                arr[i][j] = st.nextToken();
            }
        }
        System.out.println(check(arr));
    }

    static int check(String[][] arr) {
        for (int i = 0; i < 10; i++) {
            String first = arr[i][0];
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[i][j].equals(first)) {
                    cnt++;
                }
            }
            if (cnt == 10) {
                return 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            String first = arr[0][i];
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[j][i].equals(first)) {
                    cnt++;
                }
            }
            if (cnt == 10) {
                return 1;
            }
        }

        return 0;
    }
}
