class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length, n = grid[0].length;
        int[][] cost = new int[m][n];
        for (int c = 0; c < n; ++c) {
            cost[0][c] = grid[0][c];
        }
        for (int r = 1; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                int mi = Integer.MAX_VALUE;
                for (int j = 0; j < n; ++j) {
                    mi = Math.min(mi, cost[r - 1][j] + moveCost[grid[r - 1][j]][c]);
                }
                cost[r][c] = mi + grid[r][c];
            }
        }
        return IntStream.of(cost[m - 1]).min().getAsInt();
    }
}