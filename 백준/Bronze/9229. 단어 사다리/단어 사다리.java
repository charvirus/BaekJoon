import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        char[] c2 = br.readLine().toCharArray();
        while (true) {
            char[] c1 = c2;
            c2 = br.readLine().toCharArray();

            if (c2[0] == '#') {
                if (c1[0] == '#') {
                    break;
                } else {
                    if (flag) {
                        sb.append("Correct\n");
                    } else {
                        sb.append("Incorrect\n");
                    }
                    flag = true;
                    continue;
                }
            }
            if (c1[0] == '#') {
                continue;
            }

            if (flag) {
                if (c1.length != c2.length) {
                    flag = false;
                    continue;
                }
                int count = 0;
                for (int i = 0; i < c1.length; i++) {
                    if(c1[i] != c2[i])count++;
                }
                if(count != 1){
                    flag = false;
                }
            }
        }
        System.out.println(sb);
    }
}