import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());

        while (cnt-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "1":
                    int inp = Integer.parseInt(st.nextToken());
                    stack.push(inp);
                    break;
                case "2":
                    if (!stack.empty()) {
                        sb.append(stack.pop());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    sb.append(stack.empty() ? 1 : 0).append("\n");
                    break;
                case "5":
                    if(!stack.empty()){
                        sb.append(stack.peek());
                    }else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }


}