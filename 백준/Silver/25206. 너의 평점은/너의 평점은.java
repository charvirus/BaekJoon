import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumNumXScore = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            double num = 0;

            if (!score.equals("P")) {
                switch (score) {
                    case "A+":
                        num = 4.5;
                        break;
                    case "A0":
                        num = 4.0;
                        break;
                    case "B+":
                        num = 3.5;
                        break;
                    case "B0":
                        num = 3.0;
                        break;
                    case "C+":
                        num = 2.5;
                        break;
                    case "C0":
                        num = 2.0;
                        break;
                    case "D+":
                        num = 1.5;
                        break;
                    case "D0":
                        num = 1.0;
                        break;
                    case "F":
                        num = 0.0;
                        break;
                    default:
                        break;
                }
                sumNumXScore += (credit * num);
                sumNum += credit;
            }
        }
        System.out.printf("%.6f", sumNumXScore / sumNum);
    }
}