package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] ground = new int[N][M];

        int min = 256;
        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                if (ground[i][j] < min) {
                    min = ground[i][j];
                }
                if (ground[i][j] > max) {
                    max = ground[i][j];
                }
            }
        }

        int min_time = 1000000000;
        int max_height = 0;

        for (int height = min; height <= max; height++) {
            int count = 0;
            int block = B;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ground[i][j] < height) {
                        count += height - ground[i][j];
                        block -= height - ground[i][j];
                    } else {
                        count += (ground[i][j] - height) * 2;
                        block += ground[i][j] - height;
                    }
                }
            }
            if (block < 0){
                break;
            }
            if(min_time >= count){
                min_time = count;
                max_height = height;
            }
        }
        System.out.println(min_time+" "+max_height);
    }
}
