import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int d = Integer.parseInt(br.readLine());

        for (int i = 0; i < d; i++) {
            if (d == 1) {
                sb.append("*");
            } else {
                if (i == 0) {
                    sb.append(" ".repeat(d - i - 1)).append("*");
                } else {
                    sb.append(" ".repeat(d - i - 1)).append("*");
                    if(i==d-1){
                        sb.append("*".repeat(i*2));
                    }else{
                    sb.append(" ".repeat(i * 2 - 1)).append("*");
                    }
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
