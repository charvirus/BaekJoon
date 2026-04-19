import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int cnt = 0;
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch == 'c') {
                if (i < inp.length() - 1) {
                    if (inp.charAt(i + 1) == '-') {
                        i++;
                    } else if (inp.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i < inp.length() - 1) {
                    if (inp.charAt(i + 1) == 'z') {
                        if (i < inp.length() - 2) {
                            if (inp.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (inp.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'l' || ch == 'n') {
                if (i < inp.length() - 1) {
                    if (inp.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 's' || ch == 'z') {
                if (i < inp.length() - 1) {
                    if (inp.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}