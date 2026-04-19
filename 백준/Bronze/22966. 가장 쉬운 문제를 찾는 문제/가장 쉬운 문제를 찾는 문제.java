import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Question> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            list.add(new Question(st.nextToken(), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);
        System.out.println(list.get(0).name);
    }

}

class Question implements Comparable<Question> {
    String name;
    int difficulty;

    public Question(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    @Override
    public int compareTo(Question q) {
        return this.difficulty - q.difficulty;
    }
}