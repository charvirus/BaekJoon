import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> list = new HashSet<>();
        String inp = br.readLine();
        for (int i = 0; i < inp.length(); i++) {
            for (int j = i + 1; j <= inp.length(); j++) {
                list.add(inp.substring(i, j));
            }
        }

        System.out.println(list.size());
    }
}