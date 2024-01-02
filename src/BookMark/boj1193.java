package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        br.close();

        int diagonalSum = 0, diagonalCount = 1;

        while (true) {
            if (inp <= diagonalSum + diagonalCount) {
                if (diagonalCount % 2 == 1) {
                    System.out.println(diagonalCount - (inp - diagonalSum - 1) + "/" + (inp - diagonalSum));
                    break;
                } else {
                    System.out.println((inp - diagonalSum) + "/" + (diagonalCount - (inp - diagonalSum - 1)));
                    break;
                }
            } else {
                diagonalSum += diagonalCount;
                diagonalCount++;
            }
        }
    }
}
