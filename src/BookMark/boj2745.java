package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String inp = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int output = 0;
        int mul = 1;

        for (int i = inp.length() - 1; i >= 0; i--) {
            char c = inp.charAt(i);
            if ('A' <= c && c <= 'Z') {
                output += (c - 55) * mul;
            } else {
                output += (c - '0') * mul;
            }
            mul *= num; // 자릿수를 넘어갈때 곱을 해줘야함
        }

        System.out.println(output);
    }
}