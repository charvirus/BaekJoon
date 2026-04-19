import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        HashSet<String> hash = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < time; i++) {
            String inp = br.readLine();
            if (Objects.equals(inp, "ENTER")) {
                hash.clear();
            } else if (!hash.contains(inp)) {
                cnt++;
                hash.add(inp);
            }
        }
        System.out.println(cnt);
    }


}