import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        double diagnol = Math.sqrt(Math.pow(H, 2) + Math.pow(W, 2));
        double size = D / diagnol;
        int h = (int) Math.floor(H * size);
        int w = (int) Math.floor(W * size);

        System.out.println(h+" "+w);
    }
}

