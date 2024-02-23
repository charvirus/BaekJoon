package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<int[]> deque = new ArrayDeque<>();
        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cnt; i++) {
            deque.offer(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }
        sb.append("1 ");
        int dist = deque.pollFirst()[1];
        while (!deque.isEmpty()) {
            if (dist > 0) {
                for (int i = 1; i < dist; i++) {
                    deque.add(deque.poll());
                }
                int[] idx = deque.poll();
                dist = idx[1];
                sb.append(idx[0] + " ");
            } else {
                for (int i = 1; i < -dist; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                int[] idx = deque.pollLast();
                dist = idx[1];
                sb.append(idx[0] + " ");
            }
        }
        System.out.println(sb);
    }
}
