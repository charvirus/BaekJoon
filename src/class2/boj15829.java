package class2;

import java.io.*;
// 해쉬함수
public class boj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // 제곱을 여러번 하면 int 값을 벗어나니 long으로 지정 해야함
        long prime = 1234567891;
        long sum = 0;
        long r = 1;

        for (int i = 0; i < cnt; i++) {
            //모듈러 연산은 분배 법칙이 성립되니 r 제곱도 나머지 연산 해줘야함
            sum += ((str.charAt(i) - 'a' + 1) * r) % prime;
            r = ((r * 31) % prime);

        }

        bw.write(sum % prime + "");
        bw.flush();
        bw.close();
    }
}
