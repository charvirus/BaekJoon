import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        char[] champion = new char[R];
        champion = br.readLine().toCharArray();
        int N = Integer.parseInt(br.readLine());
        char[][] contender = new char[N][R];
        int score = 0;
        int possibleMaxScore = 0;

        for (int i = 0; i < N; i++) {
            contender[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < N; j++) {
                score += getScore(champion[i], contender[j][i]);
            }
        }

        for (int i = 0; i < R; i++) {
            int rScore = 0;
            int pScore = 0;
            int sScore = 0;
            for (int j = 0; j < N; j++) {
                rScore += getScore('R', contender[j][i]);
                pScore += getScore('P', contender[j][i]);
                sScore += getScore('S', contender[j][i]);
            }
            possibleMaxScore += Math.max(rScore, Math.max(pScore, sScore));
        }
        System.out.println(score);
        System.out.println(possibleMaxScore);
    }

    static int getScore(char s, char c) {
        if (s == c) {
            return 1;
        } else if (s == 'S' && c == 'P' ||
                s == 'P' && c == 'R' ||
                s == 'R' && c == 'S') {
            return 2;
        }
        return 0;
    }
}