import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inp = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;
        while(cnt != inp){
            num ++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        System.out.println(num);
    }

}