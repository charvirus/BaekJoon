import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] word = "CAMBRIDGE".toCharArray();
        String inp = br.readLine();

        for(int i = 0;i<word.length;i++){
            if(inp.indexOf(word[i])>-1){
                inp = inp.replace(String.valueOf(word[i]),"");
            }
        }
        System.out.println(inp);
    }
}