import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int cnt = Integer.parseInt(br.readLine());
        int x;
        while (cnt-- > 0) {
            st = new StringTokenizer(br.readLine());
            int inp = Integer.parseInt(st.nextToken());
            switch (inp) {
                case 1:
                    x = Integer.parseInt(st.nextToken());
                    deque.offerFirst(x);
                    break;
                case 2:
                    x = Integer.parseInt(st.nextToken());
                    deque.offerLast(x);
                    break;
                case 3:
                    if (deque.peekFirst() != null) {
                        sb.append(deque.pollFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 4:
                    if (deque.peekLast() != null) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    if (deque.peekFirst() != null) {
                        sb.append(deque.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 8:
                    if (deque.peekLast() != null) {
                        sb.append(deque.peekLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}