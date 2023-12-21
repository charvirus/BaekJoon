import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] str = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            str[i] = br.readLine();
        }
        int sum = 0;
        int chk = 0;

        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                // 다음 문자열이 O거나 X면 검사함
                if (s.charAt(j) == 'O') {
                    chk++;
                    sum += chk;
                } else {
                    chk = 0;
                }
            }
            System.out.println(+sum);
            sum = 0;
            chk = 0;
        }

        bw.flush();
    }
}