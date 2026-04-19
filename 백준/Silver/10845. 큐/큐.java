import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] queue = new int[10001];
    static int front;
    static int back;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inp; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void push(int num) {
        queue[back] = num;
        back++;
    }

    public static int pop() {
        if (back - front == 0) return -1;
        else {
            int P = queue[front];
            front++;
            return P;
        }
    }

    public static int size() {
        return back - front;
    }

    public static int empty() {
        if (back - front == 0) return 1;
        else return 0;
    }

    public static int front() {
        if (back - front == 0) return -1;
        else {
            int T = queue[front];
            return T;
        }
    }

    public static int back() {
        if (back - front == 0) return -1;
        else {
            int T = queue[back-1];
            return T;
        }
    }
}
