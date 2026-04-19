import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long i = a.nextLong();
        long j = a.nextLong();
        a.close();
        int ot = 0;
        if (i > 0 && j > 0) {
            ot = 1;
        } else if (i > 0 && j < 0) {
            ot = 4;
        } else if (i < 0 && j > 0) {
            ot = 2;
        } else if (i < 0 && j < 0) {
            ot = 3;
        }
        System.out.println(ot);
    }
}