package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        while (cnt-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            // 큐의 제일 큰 수를 0번째에 오게 만들어 소거해 정렬 한 뒤 순서 찾는 식
            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean max = true;
                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        q.offer(front);
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        max = false;
                        break;
                    }
                }
                if (!max) {
                    continue;
                }
                count++;
                if (front[0] == M) {
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
