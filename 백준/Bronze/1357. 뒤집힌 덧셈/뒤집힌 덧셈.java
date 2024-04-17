import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String a = st.nextToken();
        String b = st.nextToken();

        System.out.println(rev(String.valueOf(rev(a)+rev(b))));
    }

    static int rev(String a){
        StringBuilder reversed= new StringBuilder();
        for(int i = a.length()-1;i>=0;i--){
            reversed.append(a.charAt(i));
        }

        return Integer.parseInt(reversed.toString());
    }
}