import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int inp = Integer.parseInt(br.readLine());
            dwarf[i] = inp;
            sum += inp;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 9; j++) {
                if(sum - dwarf[i] - dwarf[j] == 100){
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    Arrays.sort(dwarf);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(dwarf[k]);
                    }
                    return;
                }
            }
        }
    }

}