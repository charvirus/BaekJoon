package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();

        // 단어 갯수 세는 배열, 영어는 26글자여서 크기를 26으로 함
        int[] cnt = new int[26];

        // 영어 대문자로 변경된 문장에 아스키 대문자 A를 빼면 각 단어의 갯수를 셈
        for (int i = 0; i < str.length(); i++) {
            cnt[(int) str.charAt(i) - 65]++;
        }


        int max = -1;
        char ans = '?';

        // 가장 많이 불린 단어의 갯수를 최대 값으로 대입, 단어의 답을 지정
        for (int j = 0; j < cnt.length; j++) {
            if (cnt[j] > max) {
                max = cnt[j];
                ans = (char) (j + 65);
            } else if (cnt[j] == max) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}