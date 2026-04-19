import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];

        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a[j].length; k++) {
                a[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a[j].length; k++) {
                b[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a[j].length; k++) {
                System.out.print(a[j][k] + b[j][k] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}