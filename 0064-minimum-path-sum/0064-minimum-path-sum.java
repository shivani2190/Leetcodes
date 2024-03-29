class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        // init first row, since only move down or right, first line can only move from left to right
        for (int c = 1; c < col; c++) {
            grid[0][c] += grid[0][c - 1];
        }
        // init first col, only move down
        for (int r = 1; r < row; r++) {
            grid[r][0] += grid[r - 1][0];
        }
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                grid[r][c] += Math.min(grid[r - 1][c], grid[r][c - 1]);
            }
        }
        return grid[row - 1][col - 1];
    }
}