package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int inp = Integer.parseInt(br.readLine());

        while(inp>=5){
            cnt += inp / 5;
            inp /= 5;
        }

        System.out.println(cnt);
    }
}
