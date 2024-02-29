import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int inp;
    static boolean[] prime = new boolean[1004001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setPrime();
        inp = Integer.parseInt(br.readLine());
        for (int i = inp;; i++) {
            if ((!prime[i] && checkPelin(i))) {
                System.out.println(i);
                break;
            }
        }

    }

    static void setPrime() {
        int sqrt = (int) Math.sqrt(prime.length);
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= sqrt; i++) {
            for (int j = i; j * i < prime.length; j++) {
                prime[i * j] = true;
            }
        }
    }

    static boolean checkPelin(int i) {
        String str = Integer.toString(i);
        int length = str.length();
        for (int j = 0; j < length / 2; j++) {
            if (str.charAt(j) != str.charAt(length - j - 1)) {
                return false;
            }
        }
        return true;
    }

}