import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] score = new int[x];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < x; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int totalScore = 0;
            for (int j = 0; j < x; j++) {
                String ans = st.nextToken();
                if (Objects.equals(ans, "O")) {
                    totalScore += score[j];
                }
            }
            list.add(new Student(num, totalScore));
        }

        Collections.sort(list);
        System.out.println(list.get(0).num + " " +list.get(0).score);
    }

    static class Student implements Comparable<Student> {
        int num;
        int score;

        public Student(int num, int score) {
            this.num = num;
            this.score = score;
        }
        @Override
        public int compareTo(Student o) {
            if (this.score > o.score) {
                return -1;
            }
            if (this.score < o.score) {
                return 1;
            }

            return this.num - o.num;
        }
    }
}