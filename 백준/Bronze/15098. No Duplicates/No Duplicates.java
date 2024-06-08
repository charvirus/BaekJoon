import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        StringTokenizer st = new StringTokenizer(inp," ");
        boolean flag = false;
        Map<String,Integer> map = new HashMap<>();
        while(st.hasMoreTokens()){
            String string = st.nextToken();
            map.put(string, map.getOrDefault(string,0)+1);
            if(map.get(string) == 2){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}