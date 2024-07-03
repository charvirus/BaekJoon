
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int inp = Integer.parseInt(br.readLine());
            int sum = 0;
            if (inp == 0) {
                break;
            } else {
                for (int i = inp; i >= 1; i--) {
                    sum += i * i;
                }
                sb.append(sum + "\n");
            }
        }
        System.out.println(sb);
    }
}