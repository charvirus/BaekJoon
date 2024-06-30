import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        long sum = 0;
        for (int i = 0; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            st.nextToken();
            if (i == 0) {
                sum = x1;
            } else {
                sum = (x1 + sum * x) % 1000000007;
            }
        }
        System.out.println(sum);
        /*https://ko.wikipedia.org/wiki/%ED%98%B8%EB%84%88%EC%9D%98_%EB%B0%A9%EB%B2%95
        호너의 방법을 사용하여 다항식 \( 10x^3 + 3x^2 + 9x + 3 \)을 변환해 보겠습니다.

호너의 방법(Horner's method)은 다항식을 다음과 같이 변형하여 계산을 단순화하는 방법입니다:
\[ a_n x^n + a_{n-1} x^{n-1} + \cdots + a_1 x + a_0 \]
이 다항식을 다음과 같은 형태로 표현합니다:
\[ (((a_n x + a_{n-1}) x + a_{n-2}) x + \cdots + a_1) x + a_0 \]

다항식 \( 10x^3 + 3x^2 + 9x + 3 \)에 대해, 각 계수는 다음과 같습니다:
\[ a_3 = 10, \quad a_2 = 3, \quad a_1 = 9, \quad a_0 = 3 \]

호너의 방법을 적용하면:

1. 가장 높은 차수의 계수부터 시작합니다:
\[ 10x^3 + 3x^2 + 9x + 3 \]

2. \( x \)로 묶어서 계산합니다:
\[ x (10x^2 + 3x + 9) + 3 \]

3. 다시 \( x \)로 묶습니다:
\[ x (x (10x + 3) + 9) + 3 \]

따라서 호너의 방법으로 표현된 다항식은 다음과 같습니다:
\[ ((10x + 3)x + 9)x + 3 \]

이를 단계별로 전개하면:

1. \( 10x + 3 \)
2. \( (10x + 3)x = 10x^2 + 3x \)
3. \( (10x^2 + 3x) + 9 = 10x^2 + 3x + 9 \)
4. \( (10x^2 + 3x + 9)x = 10x^3 + 3x^2 + 9x \)
5. \( (10x^3 + 3x^2 + 9x) + 3 = 10x^3 + 3x^2 + 9x + 3 \)

결과적으로, 호너의 공식으로 변환된 \( 10x^3 + 3x^2 + 9x + 3 \)는 다음과 같습니다:
\[ ((10x + 3)x + 9)x + 3 \]
        * */
    }
}