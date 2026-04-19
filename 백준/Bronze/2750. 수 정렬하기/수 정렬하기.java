import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inp = Integer.parseInt(br.readLine());

        int[] arr = new int[inp];

        StringBuilder sb =new StringBuilder();

        for (int i = 0; i < inp; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < inp - 1; i++) {
            for (int j = i; j < inp; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i :arr){
            sb.append(i+"\n");
        }

        System.out.println(sb);
    }

}