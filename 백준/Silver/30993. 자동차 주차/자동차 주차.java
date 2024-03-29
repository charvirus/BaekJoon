import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        System.out.println(fact(N) / (fact(A) * fact(B) * fact(C)));
    }

    /*N개의 차들을 색깔에 상관없이 나열하면 경우의 수는 N!
    A개의 차들은 색깔이 같으므로 다른애들은 고정시키고 얘네끼리만 바뀌면 똑같으므로 A!로 나누고
    B개의 차들은 색깔이 같으므로 다른애들은 고정시키고 얘네끼리만 바뀌면 똑같으므로 B!로 나누고
    C개의 차들은 색깔이 같으므로 다른애들은 고정시키고 얘네끼리만 바뀌면 똑같으므로 C!로 나누면
    결과는 N!/A!B!C!*/
    static long fact(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}