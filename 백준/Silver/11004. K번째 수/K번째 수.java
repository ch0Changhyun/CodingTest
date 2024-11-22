import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 줄에 N과 K를 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        // 두 번째 줄에 N개의 수를 입력받아 배열에 저장
        int[] array = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        
        // K번째 수 출력 (인덱스는 0부터 시작하므로 K-1)
        System.out.println(array[K - 1]);
    }
}
