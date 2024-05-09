import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer date = new StringTokenizer(st.nextToken(), "-");
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear = false;
        int YYYY = Integer.parseInt(date.nextToken());
        int MM = Integer.parseInt(date.nextToken());
        int DD = Integer.parseInt(date.nextToken());
        int d = Integer.parseInt(st.nextToken())-1;
        LocalDate inpDate = LocalDate.of(YYYY,MM,DD);


        System.out.println(inpDate.plusDays(d));
    }
}