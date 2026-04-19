import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long inp = Long.parseLong(br.readLine());
        System.out.println((inp-2)*(inp-1)*inp/6+"\n"+3);
    }
}