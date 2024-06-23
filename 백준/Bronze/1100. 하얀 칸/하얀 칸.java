import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        boolean flag = true;

        for (int i = 0; i < 8; i++) {
            String inp = br.readLine();
            for (int j = 0; j < inp.length(); j++) {
                if(flag && inp.charAt(j) == 'F'){
                    cnt++;
                }
                flag = !flag;
            }
            flag = !flag;
        }
        System.out.println(cnt);
    }
}