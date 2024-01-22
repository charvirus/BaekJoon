import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean[] card = new boolean[20000001];

        int uInp = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < uInp; i++) {
            card[Integer.parseInt(st.nextToken()) + 10000000] = true;
        }

        int cInp = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cInp; i++) {
            if(card[Integer.parseInt(st.nextToken()) + 10000000]){
                sb.append(1);
            }else{
                sb.append(0);
            }sb.append(" ");
        }
        System.out.println(sb);
    }
}