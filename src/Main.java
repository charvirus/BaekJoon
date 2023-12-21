import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int[] arr = new int[8];
        int chk = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        br.close();
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] - arr[i + 1] == 1) {
                chk = -1;
            } else if (arr[i] - arr[i + 1] == -1) {
                chk = 1;
            } else {
                chk = 0;
                break;
            }
            i++;
        }
        if (chk == -1) {
            bw.write("descending");
        } else if (chk == 1) {
            bw.write("ascending");
        } else {
            bw.write("mixed");
        }
        bw.flush();
    }
}

