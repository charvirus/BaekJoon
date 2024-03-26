import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static int gaurd = 0;
    static int y = 0;
    static int x = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        char[][] arr = new char[y][x];

        for (int i = 0; i < y; i++) {
            String inp = br.readLine();
            for (int j = 0; j < inp.length(); j++) {
                arr[i][j] = inp.charAt(j);
            }
        }

        find(arr);

        System.out.println(gaurd);
    }

    static void find(char[][] arr) {
        int count = 0;
        for (int i = 0; i < y; i++) {
            int cnt = 0;
            for (int j = 0; j < x; j++) {
                if (arr[i][j] == 'X') {
                    break;
                }else{
                    cnt++;
                }
            }
            if(cnt == x){
                count++;
            }
        }

        gaurd = count;

        count = 0;

        for (int i = 0; i < x; i++) {
            int cnt = 0;
            for (int j = 0; j < y; j++) {
                if (arr[j][i] == '.') {
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt == y){
                count++;
            }
        }

        gaurd = Math.max(gaurd,count);
    }
}