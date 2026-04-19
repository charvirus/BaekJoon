
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                int inp = Integer.parseInt(st.nextToken());
                switch (j) {
                    case 0:
                        sum += inp * 6;
                        break;
                    case 1:
                        sum += inp * 3;
                        break;
                    case 2:
                        sum += inp * 2;
                        break;
                    case 3:
                        sum += inp;
                        break;
                    case 4:
                        sum += inp * 2;
                        break;
                }
            }
            sb.append(sum + " ");
        }
        System.out.println(sb);
    }
}