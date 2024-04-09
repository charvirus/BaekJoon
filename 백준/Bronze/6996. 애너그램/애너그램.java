import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[26];
        int[] compare = new int[26];
        for (int i = 0; i < time; i++) {
            boolean chk = false;
            arr = new int[26];
            compare = new int[26];
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();
            for (int j = 0; j < a.length(); j++) {
                arr[a.charAt(j) - 'a']++;
            }
            for (int j = 0; j < b.length(); j++) {
                compare[b.charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                if (arr[j] != compare[j]) {
                    chk = true;
                    break;
                }
            }
            if (chk) {
                sb.append(a + " & " + b + " are NOT anagrams.\n");
            } else {
                sb.append(a + " & " + b + " are anagrams.\n");
            }
        }

        System.out.println(sb);
    }
}