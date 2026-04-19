import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i <= inp; i++) {
            boolean flag = false;
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (!(str.charAt(j) == '4' || str.charAt(j) == '7')) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if(max <= i){
                    max = i;
                }
            }
        }

        System.out.println(max);
    }
}