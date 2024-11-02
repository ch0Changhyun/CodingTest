import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        
        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("STRAWBERRY", 0);
        fruitCount.put("BANANA", 0);
        fruitCount.put("LIME", 0);
        fruitCount.put("PLUM", 0);
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            fruitCount.put(fruit, fruitCount.get(fruit) + count);
        }
        
        if (fruitCount.containsValue(5)) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        
        br.close();
        bw.close();
    }
}
