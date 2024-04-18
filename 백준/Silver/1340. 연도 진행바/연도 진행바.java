import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nowMin = 0;
        int thisYearmin = 0;
        int month = 0;
        boolean leapYear = false;
        int monthIndex = 0;
        String inpMonth = st.nextToken();
        int day = Integer.parseInt(st.nextToken().replaceAll("[,]", "")) - 1;
        int year = Integer.parseInt(st.nextToken());
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            monthDay[2]++;
        }
        switch (inpMonth) {
            case "January":
                monthIndex = 1;
                break;
            case "February":
                monthIndex = 2;
                break;
            case "March":
                monthIndex = 3;
                break;
            case "April":
                monthIndex = 4;
                break;
            case "May":
                monthIndex = 5;
                break;
            case "June":
                monthIndex = 6;
                break;
            case "July":
                monthIndex = 7;
                break;
            case "August":
                monthIndex = 8;
                break;
            case "September":
                monthIndex = 9;
                break;
            case "October":
                monthIndex = 10;
                break;
            case "November":
                monthIndex = 11;
                break;
            case "December":
                monthIndex = 12;
                break;
        }
        for (int i = 0; i < monthIndex; i++) {
            month += monthDay[i];
        }
        for (int i = 0; i < 13; i++) {
            thisYearmin += monthDay[i];
        }
        String time = st.nextToken();
        st = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(st.nextToken()) * 60;
        int min = Integer.parseInt(st.nextToken());

        thisYearmin *= 1440;

        nowMin = ((month + day) * 1440) + hour + min;

        System.out.println(((double) nowMin / (double) thisYearmin) * 100);
    }
}