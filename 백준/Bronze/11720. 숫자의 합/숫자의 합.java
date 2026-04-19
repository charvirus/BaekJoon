import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        System.out.println(sum);
    }
}