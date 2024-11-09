import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");
            Collections.reverse(Arrays.asList(words));
            bw.write("Case #" + i + ": ");
            for (String word : words) {
                bw.write(word + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
