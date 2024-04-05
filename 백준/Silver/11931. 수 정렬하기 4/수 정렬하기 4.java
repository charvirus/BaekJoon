import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inp = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<inp;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(Comparator.reverseOrder());
        for(int i = 0;i<inp;i++){
            sb.append(arr.get(i)+"\n");
        }
        System.out.println(sb);
    }
}