package class1;

import java.io.*;

public class boj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String inp = br.readLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < inp.length(); i++) {
            if (arr[(int) inp.charAt(i) - 'a'] == -1) {
                arr[(int) inp.charAt(i) - 'a'] = i;
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        br.close();
        bw.flush();
    }
}
