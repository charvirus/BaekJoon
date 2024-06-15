import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        StringBuilder sb = new StringBuilder();
        double max = 0;
        while (true) {
            int inp = Integer.parseInt(br.readLine());
            if (inp == 0) {
                break;
            } else {
                max = 0;
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < inp; i++) {
                    st = new StringTokenizer(br.readLine(), " ");
                    String name = st.nextToken();
                    double height = Double.parseDouble(st.nextToken());
                    if(height > max){
                        list = new ArrayList<>();
                    } else if (height < max) {
                        continue;
                    }
                    max = height;
                    list.add(name);
                }
                for(String s : list){
                    sb.append(s+" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}

