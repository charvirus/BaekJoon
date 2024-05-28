import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Long,Integer> map = new HashMap<>();
        long max = -1;
        for (int i = 0; i < N; i++) {
            long inp = Long.parseLong(br.readLine());
            map.put(inp, map.getOrDefault(inp, 0)+1);
        }
        long num = 0;
        for(Map.Entry<Long,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                num = entry.getKey();
            }else if (entry.getValue() == max){
                num = Math.min(entry.getKey(),num);
            }
        }
        System.out.println(num);


    }
}