import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int time = Integer.parseInt(br.readLine());
        for (int i = 0; i < time; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(checkCircle(x1, y1, r1, x2, y2, r2) + "\n");
        }

        System.out.println(sb);
    }

    static int checkCircle(int a1, int b1, int r1, int a2, int b2, int r2) {
        int distance = (int) (Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        if (a1 == a2 && b1 == b2 && r1 == r2) {
            return -1;
        } else if (distance > Math.pow(r1 + r2, 2) || distance < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (distance == Math.pow(r1 - r2, 2) || distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        return 2;
    }
}