import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp1 = br.readLine();
        String inp2 = br.readLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < inp1.length(); i++) {
            if(inp1.charAt(i) == 'a'){
                cnt1++;
            }
        }

        for (int i = 0; i < inp2.length(); i++) {
            if(inp2.charAt(i) == 'a'){
                cnt2++;
            }
        }
        if(cnt1 < cnt2){
            System.out.println("no");
        }else{
            System.out.println("go");
        }
    }
}