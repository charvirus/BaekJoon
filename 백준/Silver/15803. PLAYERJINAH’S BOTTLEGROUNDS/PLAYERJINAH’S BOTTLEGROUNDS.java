import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double[][] arr = new double[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        if(arr[0][0]== arr[1][0]|| arr[1][0]==arr[2][0] || arr[2][0]==arr[0][0]) {
            if(arr[0][0]== arr[1][0]&& arr[1][0]==arr[2][0])
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else if(arr[0][1]== arr[1][1]|| arr[1][1]==arr[2][1] || arr[2][1]==arr[0][1]) {
            if(arr[0][1]== arr[1][1]&& arr[1][1]==arr[2][1])
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else {
            if((arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0])==(arr[2][1]-arr[0][1])/(arr[2][0]-arr[0][0]))
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }
    }
}