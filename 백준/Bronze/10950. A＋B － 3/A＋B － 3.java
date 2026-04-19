import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int a = 0; a < i; a++) {
            int j = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(j + k);
        }
    }
}