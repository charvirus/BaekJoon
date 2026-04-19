import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int clas = 0;
        boolean flag = false;
        int[] arr = new int[M];
        for (int i = 0; i < N; i++) {
            String inp = br.readLine();
            for (int j = 0; j < inp.length(); j++) {
                if (inp.charAt(j) == 'O') {
                    arr[j]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                clas = i+1;
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(clas);
        }                          else{
            System.out.println("ESCAPE FAILED");
        }


    }
}