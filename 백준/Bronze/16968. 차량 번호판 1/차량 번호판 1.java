import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int result;

        int numD = 10;
        int numC = 26;

        if (inp.charAt(0) == 'c') {
            result = numC;
        } else {
            result = numD;
        }

        for (int i = 1; i < inp.length(); i++) {
            if(inp.charAt(i) == 'c'){
                if(inp.charAt(i-1) == 'c'){
                    result *= (numC -1);
                }else{
                    result *= numC;
                }
            }else{
                if(inp.charAt(i-1) == 'c'){
                    result *= numD;
                }else{
                    result *= (numD -1);
                }
            }
        }

        System.out.println(result);
    }
}