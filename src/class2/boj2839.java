package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inp = Integer.parseInt(br.readLine());

        if (inp == 4 || inp == 7) {
            System.out.println(-1);
        } else if (inp % 5 == 0) {
            System.out.println(inp / 5);
        } else if (inp % 5 == 1 || inp % 5 == 3) {
            System.out.println(inp / 5 + 1);
        } else if (inp % 5 == 4 || inp % 5 == 2) {
            System.out.println(inp / 5 + 2);
        }
    }
}
