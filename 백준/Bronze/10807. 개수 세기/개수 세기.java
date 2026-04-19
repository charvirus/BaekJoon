import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] a = new int[i];
        int cnt = 0;

        for (int k = 0; k < i; k++) {
            a[k] = sc.nextInt();
        }
        i = sc.nextInt();
        for (int k : a) {
            if (k == i) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}