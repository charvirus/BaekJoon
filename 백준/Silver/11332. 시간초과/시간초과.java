import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int time = Integer.parseInt(br.readLine());

        for (int i = 0; i < time; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String S = st.nextToken();
            // 최대 범위
            int N = Integer.parseInt(st.nextToken());
            // 테스트 케이스 개수
            int T = Integer.parseInt(st.nextToken());
            // 제한 시간 단위
            int L = Integer.parseInt(st.nextToken());

            chkTime(S,N,T,L);
        }
        System.out.println(sb);
    }

    static void chkTime(String s, int N, int T, int L) {
        String pass = "May Pass.";
        String fail = "TLE!";
        double caseTime = (double) (L * 100000000) / T;
        long temp;
        switch (s) {
            case "O(N)":
                if (caseTime >= N) {
                    sb.append(pass);
                } else {
                    sb.append(fail);
                }
                break;
            case "O(N^2)":
                if ((caseTime / N) >= N) {
                    sb.append(pass);
                } else {
                    sb.append(fail);
                }
                break;
            case "O(N^3)":
                if (((caseTime / N) / N) >= N) {
                    sb.append(pass);
                } else {
                    sb.append(fail);
                }
                break;
            case "O(2^N)":
                temp = 1;
                for (int i = 0; i < N; i++) {
                    temp = temp << 1;
                    if (temp > caseTime) {
                        sb.append(fail).append("\n");
                        return;
                    }
                }
                sb.append(pass);
                break;
            case "O(N!)":
                temp = 1;
                for (int i = 2; i <= N; i++) {
                    temp = temp * i;
                    if (temp > caseTime) {
                        sb.append(fail).append("\n");
                        return;
                    }
                }
                sb.append(pass);
                break;
        }
        sb.append("\n");
    }
}