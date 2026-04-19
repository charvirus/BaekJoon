import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[30];

        for (int k = 0; k < a.length - 2; k++) {
            int i = sc.nextInt();
            a[i - 1] = i;
        }
        for (int k = 0; k < 30; k++) {
            if (a[k] != k + 1) {
                System.out.println(k + 1);
            }
        }
        sc.close();
    }
}