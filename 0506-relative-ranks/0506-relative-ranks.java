import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[][] scoreIndex = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            scoreIndex[i][0] = score[i];
            scoreIndex[i][1] = i;
        }
        
        Arrays.sort(scoreIndex, (a, b) -> b[0] - a[0]);
        
        for (int i = 0; i < n; i++) {
            int index = scoreIndex[i][1];
            if (i == 0) {
                result[index] = "Gold Medal";
            } else if (i == 1) {
                result[index] = "Silver Medal";
            } else if (i == 2) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] score1 = {5, 4, 3, 2, 1};
        int[] score2 = {10, 3, 8, 9, 4};
        
        System.out.println(Arrays.toString(sol.findRelativeRanks(score1)));
        System.out.println(Arrays.toString(sol.findRelativeRanks(score2)));
    }
}