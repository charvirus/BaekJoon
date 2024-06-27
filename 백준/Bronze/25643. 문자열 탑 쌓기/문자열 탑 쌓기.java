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
        String blank = br.readLine();

        boolean flag = false;
        for (int i = 0; i < N-1; i++) {
            flag = false;
            String inp = br.readLine();
            for (int j = 1; j <= M; j++) {
                if(blank.substring(M - j).equals(inp.substring(0, j))){
                    flag = true;
                    break;
                }
                if(blank.substring(0,j).equals(inp.substring(M-j))){
                    flag = true;
                    break;
                }
            }
            blank = inp;
            if(!flag){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}