import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int head = s;
        int tail = 0;
        int ascend = 0;
        for (int i = 1; i < cnt; i++) {
            tail = Integer.parseInt(st.nextToken());
            if (head < tail) {
                ascend = ascend < tail - s ? tail - s : ascend;
            } else {
                s = tail;
            }
            head = tail;
        }
        System.out.println(ascend);
    }

}