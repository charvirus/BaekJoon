import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[] a = new int[i];

        for (int k = 0; k < i; k++) {
            a[k] = sc.nextInt();
        }
        sc.close();
        for (int k = 0; k < i; k++) {
            if (a[k] < j) {
                System.out.println(a[k]);
            }
        }

    }
}