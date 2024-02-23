import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        while (cnt-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String inp = st.nextToken();
            switch (inp) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.poll());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    Integer ele = queue.peek();
                    sb.append(ele == null ? -1 : ele).append("\n");
                    break;
                case "back":
                    Integer elel = queue.peekLast();
                    sb.append(elel == null ? -1 : elel).append("\n");
                    break;

            }
        }
        System.out.println(sb);
    }
}