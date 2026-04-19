import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int money = Integer.parseInt(st.nextToken());
            int amt = Integer.parseInt(st.nextToken());
            total -= money * amt;
        }
        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}