import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sun = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());

        System.out.println(sun+water+Math.min(sun,water)/10);

    }
}