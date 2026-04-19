import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (time-- > 0) {
            int inp = Integer.parseInt(st.nextToken());
            if(max < inp){
                max = inp;
            }
            if(min > inp){
                min = inp;
            }
        }
        System.out.println(max * min);
    }
}