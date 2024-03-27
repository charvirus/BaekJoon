import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] toys = new int[n + 1];
        toys[0] = 0;
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= n; i++) {
            toys[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            if (toys[i] != i) {
                int startIndex = i;
                int endIndex = 0;

                for (int j = i + 1; j <= n; j++) {
                    if (toys[j] == i) {
                        endIndex = j;
                    }
                }
                count ++;
                if (count > 100) {
                    break;
                }
                result.add(Integer.toString(startIndex));
                result.add(Integer.toString(endIndex));

                int[] sliceBefore = Arrays.copyOfRange(toys, startIndex, endIndex + 1); 
                int sliceLength = sliceBefore.length;
                int[] sliceAfter = new int[sliceLength];

                for (int j = 0; j < sliceLength; j++) {
                    sliceAfter[sliceLength - 1 - j] = sliceBefore[j];
                }
                System.arraycopy(sliceAfter, 0, toys, startIndex, sliceLength);
            }
        }

        if (count > 100) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            for (int j = 0; j < count; j++) {
                System.out.println(result.get(2 * j) + " " + result.get(2 * j + 1));
            }
        }
    }

}