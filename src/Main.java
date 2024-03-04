import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> map = new HashMap<>();
        int time = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        for (int i = 0; i < time; i++) {
            String inp = br.readLine();
            if (inp.length() < length) continue;
            map.put(inp, map.getOrDefault(inp, 0) + 1);
        }
        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str+"\n");
        }
        System.out.println(sb);
    }

}