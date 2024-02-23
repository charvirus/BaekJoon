package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        int[] QSList = new int[size];
        int[] numberList = new int[size];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size; i++) {
            QSList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size; i++) {
            numberList[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = Integer.parseInt(br.readLine());

        int[] input = new int[cnt];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cnt; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }


        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            if (QSList[i] == 0) {
                deque.addFirst(numberList[i]);
            }
        }

        for (int i = 0; i < cnt; i++) {
            deque.offer(input[i]);
            sb.append(deque.poll()+" ");
        }
        System.out.println(sb);

    }
}
