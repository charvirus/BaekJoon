package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        int bitset = 0;
        while (cnt-- > 0) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            int num;

            switch (op){
                case "add" :
                    num = Integer.parseInt(st.nextToken());
                    bitset |= (1 << (num));
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken());
                    bitset &= ~(1 << (num ));
                    break;
                case "check" :
                    num = Integer.parseInt(st.nextToken());
                    sb.append((bitset & (1 << (num ))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken());
                    bitset ^= (1 << (num));
                    break;
                case "all" :
                    bitset |= -1;
                    break;
                case "empty" :
                    bitset &= 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}
