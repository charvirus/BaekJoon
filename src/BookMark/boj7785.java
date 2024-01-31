package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String io = st.nextToken();
            if (set.contains(name)) {
                set.remove(name);
            } else {
                if (io.equals("enter")) {
                    set.add(name);
                }
            }
        }
        List<String> sort = new ArrayList<>(set);
        Collections.sort(sort, (a, b) -> {
            return b.compareTo(a);
        });
        for(String s : sort){
            sb.append(s+"\n");
        }
        System.out.println(sb);
    }
}
