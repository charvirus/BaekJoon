import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());

        for (int i = 0; i < star; i++) {
            for (int j = star - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = star - 1; i > 0; i--) {
            for (int j = 0; j < star - i; j++) {
                System.out.print(" ");
            }
            for(int j = i * 2 - 1; j > 0; j--){
                System.out.print("*");
            }

            System.out.println();
        }
        br.close();
    }
}