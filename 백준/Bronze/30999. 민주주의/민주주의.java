import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String inp = br.readLine();
            int chk = 0;
            for (int j = 0; j < M; j++) {
                if(inp.charAt(j)=='O'){
                    chk++;
                }
            }
            if(chk>inp.length()/2){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}