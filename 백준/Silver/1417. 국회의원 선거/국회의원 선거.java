import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] votes = new int[N];
        
        for (int i = 0; i < N; i++) {
            votes[i] = sc.nextInt();
        }
        
        int dasomVotes = votes[0];
        int bribes = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < N; i++) {
            pq.add(votes[i]);
        }
        
        while (!pq.isEmpty() && dasomVotes <= pq.peek()) {
            int maxVotes = pq.poll();
            maxVotes--;
            dasomVotes++;
            bribes++;
            pq.add(maxVotes);
        }
        
        System.out.println(bribes);
    }
}
