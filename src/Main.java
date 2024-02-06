import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cnt; i++) {
            int inp = Integer.parseInt(br.readLine());
            if(inp != 0){
                stack.push(inp);
            }else {
                if(!stack.empty()){
                    stack.pop();
                }
            }
        }

        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}