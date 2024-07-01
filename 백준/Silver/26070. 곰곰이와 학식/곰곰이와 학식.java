import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            int addX = 0;
            int addY = 0;
            int addZ = 0;
            int chicken = Math.min(A, X);
            sum += chicken;
            A -= chicken;
            X -= chicken;
            int pizza = Math.min(B, Y);
            sum += pizza;
            B -= pizza;
            Y -= pizza;
            int hamburger = Math.min(C, Z);
            sum += hamburger;
            C -= hamburger;
            Z -= hamburger;
            if (Z >= 3) {
                addX += Z / 3;
                Z = Z - (Z / 3 * 3);
            }
            if (X >= 3) {
                addY += X / 3;
                X = X - (X / 3 * 3);
            }
            if (Y >= 3) {
                addZ += Y / 3;
                Y = Y - (Y / 3 * 3);
            }
            X += addX;
            Y += addY;
            Z += addZ;
        }
        System.out.println(sum);
    }
}