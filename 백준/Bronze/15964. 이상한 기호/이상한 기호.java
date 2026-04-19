import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        long i = Long.parseLong(strs[0]);
        long k = Long.parseLong(strs[1]);
        System.out.println(method(i,k));
    }

    private static long method(long i, long k){
        return (i + k) * (i - k);
    }
}