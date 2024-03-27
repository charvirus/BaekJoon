import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = -1;
        String word = null;

        while (true) {
            String s = br.readLine();
            String[] split = s.toLowerCase().split("[^a-z-]");
            for(String cur : split){
                if(cur.equals("e-n-d")){
                    System.out.println(word);
                    return;
                }
                if(length < cur.length()){
                    length = cur.length();
                    word = cur;
                }
            }
        }
    }
}
