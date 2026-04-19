import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int happy = 0;
        int sad = 0;
        for(int i = 0;i<inp.length()-3;i++){
            if(inp.charAt(i) == ':'&&inp.charAt(i+1) == '-'&&inp.charAt(i+2) == ')'){
                happy++;
            } else if (inp.charAt(i) == ':'&&inp.charAt(i+1) == '-'&&inp.charAt(i+2) == '(') {
                sad++;
            }
        }
        if(happy == 0 && sad == 0){
            System.out.println("none");
        } else if (happy > sad) {
            System.out.println("happy");
        }else if(happy<sad){
            System.out.println("sad");
        } else if (happy == sad) {
            System.out.println("unsure");
        }
    }
}