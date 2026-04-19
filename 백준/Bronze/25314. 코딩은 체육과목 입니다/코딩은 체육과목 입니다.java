import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = cnt;i>0;i-=4){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}