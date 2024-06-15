import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String S = br.readLine();
        boolean flag = false;
        if (S.length() <= 25) {
            System.out.println(S);
        } else {
            StringTokenizer st = new StringTokenizer(S, ".");
            String firstSentence = st.nextToken() + ".";
            String slice = S.substring(11, S.length() - 11);
            if (firstSentence.contains(slice)) {
                flag = true;
            }

            if (flag) {
                System.out.println(S.substring(0,11)+"..."+S.substring(S.length()-11,S.length()));
            } else {
                System.out.println(S.substring(0,9)+"......"+S.substring(S.length()-10,S.length()));
            }
        }
    }
}

