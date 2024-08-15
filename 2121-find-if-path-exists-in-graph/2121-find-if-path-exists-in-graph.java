class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // BFS를 위한 큐와 방문 여부를 체크할 배열
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        // 시작 노드를 큐에 추가하고 방문 표시
        queue.offer(source);
        visited[source] = true;

        // BFS 탐색
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return true;
            }
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }
        
}
