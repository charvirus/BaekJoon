import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sentence = new StringBuilder();
        int sum = 0;
        String inp;
        while ((inp = br.readLine()) != null) {
            sentence.append(inp);
        }

        String[] arr = sentence.toString().split(",");
        for(String i : arr){
            sum += Integer.parseInt(i);
        }
        System.out.println(sum);
    }

}