package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10866 {
    static int[] deque = new int[10000];
    static int front = 0;
    static int back = 0;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inp; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
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

    public static void push_front(int num) {
        deque[front] = num;
        front = (front - 1 + 10000) % 10000;
        size++;
    }

    public static void push_back(int num) {
        back = (back + 1) % 10000;
        size++;
        deque[back] = num;
    }

    public static int pop_front() {
        if (size == 0) {
            return -1;
        }

        int ret = deque[(front + 1) % 10000];
        front = (front + 1) % 10000;
        size--;
        return ret;
    }

    public static int pop_back() {
        if (size == 0) {
            return -1;
        }
        int ret = deque[back];
        back = (back - 1 + 10000) % 10000;
        size--;
        return ret;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) return 1;
        else return 0;
    }

    public static int front() {
        if (size == 0) return -1;
        else {
            return deque[(front + 1) % 10000];
        }
    }

    public static int back() {
        if (size == 0) return -1;
        else {
            return deque[back];
        }
    }
}
