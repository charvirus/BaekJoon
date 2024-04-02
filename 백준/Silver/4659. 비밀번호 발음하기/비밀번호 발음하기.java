import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while (!(str = br.readLine()).equals("end")) {
            int cnt = 0;
            boolean check = false;
            char prev = '.';
            for (int i = 0; i < str.length(); i++) {
                if (isVowel(str.charAt(i))) {
                    check = true;
                }

                if (isVowel(str.charAt(i)) != isVowel(prev)) {
                    cnt = 1;
                } else {
                    cnt++;
                }

                if (cnt > 2 || (prev == str.charAt(i) && (str.charAt(i) != 'e' && str.charAt(i) != 'o'))) {
                    check = false;
                    break;
                }

                prev = str.charAt(i);
            }

            if (check) {
                sb.append("<" + str + "> is acceptable.\n");
            } else {
                sb.append("<" + str + "> is not acceptable.\n");
            }
        }

        System.out.println(sb);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}