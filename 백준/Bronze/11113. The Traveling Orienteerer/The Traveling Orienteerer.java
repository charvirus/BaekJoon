import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        double[][] coor = new double[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            double xi = Double.parseDouble(st.nextToken());
            double yi = Double.parseDouble(st.nextToken());
            coor[i][0] = xi;
            coor[i][1] = yi;
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            double distance = 0;
            int p = Integer.parseInt(br.readLine());
            int[] inp = new int[p];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < p; j++) {
                inp[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < inp.length - 1; j++) {
                distance += Math.sqrt(Math.pow(coor[inp[j + 1]][0] - coor[inp[j]][0], 2)
                        + Math.pow(coor[inp[j + 1]][1] - coor[inp[j]][1], 2));
            }
            sb.append(Math.round(distance) + "\n");
        }
        System.out.println(sb);
    }
}