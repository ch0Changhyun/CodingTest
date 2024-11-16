import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 최대 힙을 사용하기 위해 PriorityQueue에 음수 값을 저장
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (String num : line) {
                int value = Integer.parseInt(num);

                if (minHeap.size() < n) {
                    minHeap.add(value);
                } else if (minHeap.peek() < value) {
                    minHeap.poll();
                    minHeap.add(value);
                }
            }
        }

        System.out.println(minHeap.peek());

        br.close();
    }
}
