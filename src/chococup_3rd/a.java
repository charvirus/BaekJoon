package chococup_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cnt; i++) {
            boolean revert = false;
            int stackInt = -1;
            int factCnt = 0;
            int factoutput = 0;
            String inp = br.readLine();
            for (int j = 0; j < inp.length(); j++) {
                stack.push(inp.charAt(j));
            }
            while (!stack.empty()) {
                char pop = stack.peek();
                if (48 <= pop && pop <= 57) {
                    stackInt = stack.pop();
                } else if (stackInt != -1) {
                    stack.pop();
                    revert = !revert;
                } else {
                    stack.pop();
                    factCnt++;
                }
            }
            stackInt -= 48;
            if (factCnt == 0) {
                factoutput = stackInt;
            } else {
                for (int fcnt = 0; fcnt < factCnt; fcnt++) {
                    factoutput = factorial(stackInt);
                }
            }
            if (revert) {
                if (factoutput == 1) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            } else {
                sb.append(factoutput);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static int factorial(int inp) {
        int sum = 1;
        for (int j = inp; j >= 1; j--) {
            sum *= j;
        }
        return sum;
    }
}
