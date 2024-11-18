import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        // 최대 힙을 사용하여 가장 큰 값을 쉽게 추출할 수 있도록 합니다.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            maxHeap.offer(gift);
        }

        // k번 반복합니다.
        for (int i = 0; i < k; i++) {
            // 가장 큰 값을 추출하고 제곱근의 바닥값을 계산합니다.
            int largestGift = maxHeap.poll();
            int remainingGifts = (int) Math.floor(Math.sqrt(largestGift));

            // 업데이트된 값을 다시 힙에 삽입합니다.
            maxHeap.offer(remainingGifts);
        }

        // 남아있는 모든 값의 합을 계산합니다.
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }

        return sum;
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] gifts = {25, 64, 9, 4, 100};
    //     int k = 4;
    //     System.out.println(sol.pickGifts(gifts, k)); // 예시 출력
    // }
}
