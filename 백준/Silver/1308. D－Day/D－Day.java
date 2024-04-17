import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int setY = Integer.parseInt(st.nextToken());
        int setM = Integer.parseInt(st.nextToken());
        int setD = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int ddayY = Integer.parseInt(st.nextToken());
        int ddayM = Integer.parseInt(st.nextToken());
        int ddayD = Integer.parseInt(st.nextToken());


        if (ddayY - setY > 1000 || ddayY - setY == 1000 && (setM < ddayM || setM == ddayM && setD <= ddayD)) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + (calcutaleDay(ddayY, ddayM, ddayD) - calcutaleDay(setY, setM, setD)));
        }

    }

    static int calcutaleDay(int y, int m, int d) {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;

        for (int i = 1; i < y; i++) {
            days += 365 + isLeapYear(i);
        }

        for (int i = 1; i < m; i++) {
            if (i == 2) {
                days += isLeapYear(y);
            }
            days += monthDay[i];
        }
        days += d;

        return days;
    }

    static int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}