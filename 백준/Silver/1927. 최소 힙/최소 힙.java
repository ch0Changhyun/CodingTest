import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하여 입출력을 빠르게 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 연산의 개수 N을 입력 받음
        int n = Integer.parseInt(br.readLine());

        // PriorityQueue를 사용하여 최소 힙을 구현
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            // 각 연산을 입력 받음
            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                // x가 자연수라면 최소 힙에 추가
                minHeap.add(x);
            } else {
                // x가 0이라면 최소 힙에서 가장 작은 값을 출력하고 제거
                if (minHeap.isEmpty()) {
                    // 최소 힙이 비어 있다면 0을 출력
                    bw.write("0\n");
                } else {
                    // 최소 힙에서 가장 작은 값을 출력하고 제거
                    bw.write(minHeap.poll() + "\n");
                }
            }
        }

        // BufferedWriter를 비우고 종료
        bw.flush();
        bw.close();
        br.close();
    }
}
