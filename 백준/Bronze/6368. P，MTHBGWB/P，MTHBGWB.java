import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] code = {".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--",
            "--..", "..--", ".-.-", "---.", "----"};
    static char[] chars = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', ',', '.', '?'
    };
    static int[] msLen = {2, 4, 4, 3, 1, 4, 3, 4, 2, 4, 3, 4, 2, 2, 3, 4, 4, 3, 3, 1, 3, 4, 3, 4, 4, 4, 4, 4, 4, 4};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String result = "";
            String inp = br.readLine();
            String chgMs = "";
            String chgNum = "";
            for (int j = 0; j < inp.length(); j++) {
                int idx = extract(inp.charAt(j));
                chgNum += msLen[idx];
                chgMs += code[idx];
            }
            StringBuffer temp = new StringBuffer(chgNum);
            String reverse = temp.reverse().toString();
            for (int j = 0; j < reverse.length(); j++) {
                int idx = reverse.charAt(j) - 48;
                String cutMorse = chgMs.substring(0,idx);
                result += change(cutMorse);
                chgMs = chgMs.substring(idx);
            }
            sb.append((i+1)+": "+result+"\n");
        }
        System.out.println(sb);
    }

    static int extract(char inp) {
        for (int i = 0; i < 30; i++) {
            if (inp == chars[i]) {
                return i;
            }
        }
        return 0;
    }
    static char change(String morse){
        for (int i = 0; i < 30; i++) {
            if(morse.equals(code[i])){
                return chars[i];
            }
        }
        return 0;
    }
}