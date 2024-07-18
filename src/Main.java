import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int prev = 0;
        int N = Integer.parseInt(br.readLine());
        int[] rankStand = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            rankStand[i] = Integer.parseInt(st.nextToken());
        }
        String mvpRank = br.readLine();

        for (int i = 0; i < N; i++) {
            switch (mvpRank.charAt(i)) {
                case 'B':
                    max += rankStand[0] - prev - 1;
                    prev = rankStand[0] - prev - 1;
                    break;
                case 'S':
                    max += rankStand[1] - prev - 1;
                    prev = rankStand[1] - prev - 1;
                    break;
                case 'G':
                    max += rankStand[2] - prev - 1;
                    prev = rankStand[2] - prev - 1;
                    break;
                case 'P':
                    max += rankStand[3] - prev - 1;
                    prev = rankStand[3] - prev - 1;
                    break;
                default:
                    max += rankStand[3];
                    prev = rankStand[3];
                    break;
            }
        }

        System.out.println(max);

    }
}