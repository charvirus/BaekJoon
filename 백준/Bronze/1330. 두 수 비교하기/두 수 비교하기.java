import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long i = a.nextLong();
        long j = a.nextLong();
        a.close();
        if(i>j){
            System.out.println(">");
        } else if (i<j) {
            System.out.println("<");
        } else if (i==j) {
            System.out.println("==");
        }
    }
}