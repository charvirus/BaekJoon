import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int size = N.length();
        int total = 0;
        for(int i = 0;i<size;i++){
            switch (N.charAt(i)){
                case 'A': case'B': case 'C':
                    total  = total + 3;
                    break;
                case 'D': case'E': case 'F':
                    total  = total + 4;
                    break;
                case 'G': case'H': case 'I':
                    total  = total + 5;
                    break;
                case 'J': case'K': case 'L':
                    total  = total + 6;
                    break;
                case 'M': case'N': case 'O':
                    total  = total + 7;
                    break;
                case 'P': case'Q': case 'R': case 'S':
                    total  = total + 8;
                    break;
                case 'T': case'U': case 'V':
                    total  = total + 9;
                    break;
                case 'W': case'X': case 'Y': case 'Z':
                    total  = total + 10;
                    break;
            }
        }
        System.out.println(total);

    }
}