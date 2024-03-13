package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int inpNum = Integer.parseInt(st.nextToken());
        ArrayList<Nation> scoreboard = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            Nation attendNation = new Nation(num, gold, silver, bronze);
            scoreboard.add(attendNation);
        }

        Collections.sort(scoreboard);

        int cnt = 1;
        int rate = 1;
        if(scoreboard.get(0).num == inpNum){
            System.out.println(1);
            return;
        }

        for (int i = 1; i < N; i++) {
            Nation prev = scoreboard.get(i - 1);
            Nation cur = scoreboard.get(i);
            if ((prev.gold != cur.gold) || (prev.silver != cur.silver) || (prev.bronze != cur.bronze)) {
                rate += cnt;
                cnt = 1;
            } else {
                cnt++;
            }
            if (cur.num == inpNum) {
                System.out.println(rate);
                break;
            }
        }
    }


    static class Nation implements Comparable<Nation> {
        int num;
        int gold;
        int silver;
        int bronze;

        public Nation(int num, int gold, int silver, int bronze) {
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }


        @Override
        public int compareTo(Nation o) {

            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return o.bronze - this.bronze;
                }
                return o.silver - this.silver;
            } else {
                return o.gold - this.gold;
            }
        }
    }
}
