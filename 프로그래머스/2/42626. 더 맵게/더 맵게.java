import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // 스코빌 지수를 모두 힙에 추가합니다.
        for (int s : scoville) {
            minHeap.add(s);
        }
        
        int mixCount = 0;
        
        // 가장 작은 값이 K 이상이 될 때까지 반복합니다.
        while (minHeap.peek() < K) {
            // 스코빌 지수가 K 이상인 음식을 만들 수 없는 경우 -1을 반환합니다.
            if (minHeap.size() < 2) {
                return -1;
            }
            
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();
            int newScoville = firstMin + (secondMin * 2);
            
            minHeap.add(newScoville);
            mixCount++;
        }
        
        return mixCount;
    }
}
