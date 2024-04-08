import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int time = Integer.parseInt(st.nextToken());
        int type = check(st.nextToken().charAt(0));
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < time; i++) {
            String inp = br.readLine();
            set.add(inp);
        }
        System.out.println(set.size()/type);
    }

    static int check(char c) {
        if (c == 'Y') {
            return 1;
        } else if (c == 'F') {
            return 2;
        } else if (c == 'O') {
            return 3;
        }
        return -1;
    }
}