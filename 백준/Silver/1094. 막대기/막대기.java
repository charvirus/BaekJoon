import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sliceSize = 64;
        int inpSize = Integer.parseInt(br.readLine());
        int cnt = 0;
        int size = 0;
        while (inpSize != size) {
            if(inpSize < size + sliceSize){
                sliceSize /= 2;
            }else {
                size += sliceSize;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}