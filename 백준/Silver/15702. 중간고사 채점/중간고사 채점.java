import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] score = new int[x];
        int[] students = new int[100001];
        int maxScore = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < x; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 100001; i++) {
            students[i] = -1;
        }
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int totalScore = 0;
            for (int j = 0; j < x; j++) {
                String ans = st.nextToken();
                if (Objects.equals(ans, "O")) {
                    totalScore += score[j];
                }
            }
            students[num] = totalScore;
            maxScore = Math.max(maxScore,totalScore);
        }

        for (int i = 1; i <= 100000; i++) {
            if (students[i] == maxScore) {
                System.out.println(i + " " + maxScore);
                break;
            }
        }

    }
}