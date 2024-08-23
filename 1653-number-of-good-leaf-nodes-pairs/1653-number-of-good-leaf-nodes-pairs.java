/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private int count = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return count;
    }

    private List<Integer> dfs(TreeNode node, int distance) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.left == null && node.right == null) {
            // 리프 노드인 경우
            List<Integer> leafDistances = new ArrayList<>();
            leafDistances.add(0); // 리프 노드에서 자기 자신까지의 거리는 0
            return leafDistances;
        }

        List<Integer> leftDistances = dfs(node.left, distance);
        List<Integer> rightDistances = dfs(node.right, distance);

        // 좋은 쌍 찾기
        for (int leftDist : leftDistances) {
            for (int rightDist : rightDistances) {
                if (leftDist + rightDist + 2 <= distance) {
                    count++;
                }
            }
        }

        // 현재 노드에서 리프 노드까지의 거리 계산
        List<Integer> distances = new ArrayList<>();
        for (int leftDist : leftDistances) {
            distances.add(leftDist + 1);
        }
        for (int rightDist : rightDistances) {
            distances.add(rightDist + 1);
        }

        return distances;
    }
}
