import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] arr = {
            {'A', 'C', 'A', 'G'},
            {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'},
            {'G', 'A', 'G', 'T'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] result = new char[length];
        result = str.toCharArray();
        for (int i = length - 1; i > 0; i--) {
            char chngChar = change(result[i],result[i-1]);
            result[i - 1] = chngChar;
        }
        System.out.println(result[0]);
    }

    static char change(char inp, char inp1) {
        int a = inp1 == 'A' ? 0 : inp1 == 'G' ? 1 : inp1 == 'C' ? 2 : 3;
        int b = inp == 'A' ? 0 : inp == 'G' ? 1 : inp == 'C' ? 2 : 3;

        return arr[a][b];
    }
}