import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int[] LOVE = new int[4];

        LOVE[0] = name.length() - name.replace("L", "").length();
        LOVE[1] = name.length() - name.replace("O", "").length();
        LOVE[2] = name.length() - name.replace("V", "").length();
        LOVE[3] = name.length() - name.replace("E", "").length();

        int size = Integer.parseInt(br.readLine());
        double max = -1;
        String winner = "";
        for (int i = 0; i < size; i++) {
            int[] TEAM = new int[4];
            String inpName = br.readLine();
            TEAM[0] = LOVE[0] + inpName.length() - inpName.replace("L", "").length();
            TEAM[1] = LOVE[1] + inpName.length() - inpName.replace("O", "").length();
            TEAM[2] = LOVE[2] + inpName.length() - inpName.replace("V", "").length();
            TEAM[3] = LOVE[3] + inpName.length() - inpName.replace("E", "").length();

            double percentage = ((TEAM[0]+TEAM[1]) * (TEAM[0]+TEAM[2]) * (TEAM[0]+TEAM[3])
                    * (TEAM[1]+TEAM[2]) * (TEAM[1]+TEAM[3]) * (TEAM[2]+TEAM[3]))%100;

            if(max < percentage){
                max = percentage;
                winner = inpName;
            }else if(max == percentage){
                String[] winners = new String[2];
                winners[0] = winner;
                winners[1] = inpName;
                Arrays.sort(winners);
                winner = winners[0];
            }
        }
        System.out.println(winner);
    }
}