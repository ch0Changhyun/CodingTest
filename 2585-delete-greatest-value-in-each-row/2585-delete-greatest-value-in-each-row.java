import java.util.*;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        // 매 열에 대해 반복
        for (int col = 0; col < n; col++) {
            int maxInRow = Integer.MIN_VALUE;

            // 각 행에서 최대값 찾기
            for (int row = 0; row < m; row++) {
                if (grid[row].length == 0) continue; // 빈 행 무시

                int maxInCurrentRow = Integer.MIN_VALUE;
                int maxIndex = -1;

                // 현재 행에서 최대값과 그 인덱스 찾기
                for (int j = 0; j < grid[row].length; j++) {
                    if (grid[row][j] > maxInCurrentRow) {
                        maxInCurrentRow = grid[row][j];
                        maxIndex = j;
                    }
                }

                // 최대값을 찾으면 그 값을 -1로 설정하여 삭제
                if (maxIndex != -1) {
                    grid[row][maxIndex] = -1;
                }

                // 현재 행의 최대값을 추출하고, 이 중에서 가장 큰 값을 선택
                maxInRow = Math.max(maxInRow, maxInCurrentRow);
            }

            // 최대값을 결과에 더하기
            result += maxInRow;

            // 각 행에서 삭제된 값을 제외한 나머지 값을 다시 설정
            for (int row = 0; row < m; row++) {
                List<Integer> newRow = new ArrayList<>();
                for (int j = 0; j < grid[row].length; j++) {
                    if (grid[row][j] != -1) {
                        newRow.add(grid[row][j]);
                    }
                }
                grid[row] = newRow.stream().mapToInt(i -> i).toArray();
            }
        }

        return result;
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
    //     System.out.println(sol.deleteGreatestValue(grid1)); // 예시 출력: 8

    //     int[][] grid2 = {{10}};
    //     System.out.println(sol.deleteGreatestValue(grid2)); // 예시 출력: 10
    // }
}
