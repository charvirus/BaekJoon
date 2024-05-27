import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            String inp = br.readLine();
            map.put(inp, map.getOrDefault(inp,0)+1);
            max = Math.max(max,map.get(inp));
        }

        List<String>list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == max) list.add(entry.getKey());
        }
        Collections.sort(list);
        System.out.println(list.get(0));

    }
}