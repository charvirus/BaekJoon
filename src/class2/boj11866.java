package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= size; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < num - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
