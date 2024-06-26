import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(br.readLine());
        for (int i = 0; i < H; i++) {
            if (i <= H / 2) {
                for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < H * 2 - i * 4 - 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < (H - i) * 2 - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < (i - H/2) * 4; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (H - i) * 2 - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}