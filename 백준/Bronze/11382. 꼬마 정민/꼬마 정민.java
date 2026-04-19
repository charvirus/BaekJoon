import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long i = a.nextLong();
        long j = a.nextLong();
        long k = a.nextLong();
        a.close();
        System.out.println(i+j+k);
    }
}