import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[4];

        for (int i = 0; i < inp; i++) {
            switch (str.charAt(i)) {
                case 'A':
                    arr[0]++;
                    break;
                case 'C':
                    arr[1]++;
                    break;
                case 'G':
                    arr[2]++;
                    break;
                case 'T':
                    arr[3]++;
                    break;
            }
        }

        long result = 1;
        for(int i = 0;i<4;i++){
            result *= arr[i];
            result %= 1000000007;

        }
        System.out.println(result);
    }
}