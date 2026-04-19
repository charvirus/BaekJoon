import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        Queue<Integer> line = new LinkedList<>();
        Stack<Integer> stay = new Stack<>();

        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cnt; i++) {
            line.offer(Integer.parseInt(st.nextToken()));
        }
        int start = 1;
        while (!line.isEmpty()) {
            if (line.peek() == start) {
                line.poll();
                start++;
            } else if (!stay.isEmpty() && stay.peek() == start) {
                stay.pop();
                start++;
            } else {
                stay.push(line.poll());
            }
        }
        while (!stay.isEmpty()) {
            if (stay.peek() == start) {
                stay.pop();
                start++;
            }else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}