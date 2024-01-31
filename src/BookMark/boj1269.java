package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<Integer> list = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int n = N;
        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0){
            int inp = Integer.parseInt(st.nextToken());
            list.add(inp);
        }
        st = new StringTokenizer(br.readLine(), " ");
        while(M-->0){
            int inp = Integer.parseInt(st.nextToken());
            if(list.contains(inp)){
                n--;
            }else {
                n++;
            }
        }
        System.out.println(n);
    }
}
