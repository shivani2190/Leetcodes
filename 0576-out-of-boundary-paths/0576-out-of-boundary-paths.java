class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] dp = new long[m][n][maxMove + 1];
        
        for(long[][] e1: dp) {
            for(long[] e2: e1) {
                Arrays.fill(e2, -1);
            }
        }
        
        return (int)dfs(m, n, maxMove, startRow, startColumn, dp);
    }
    
    private long dfs(int m, int n, int maxMove, int i, int j, long[][][] dp) {
        if(i < 0 || i >= m || j < 0 || j >= n) return 1;
        
        if(maxMove == 0) return 0;
        
        if(dp[i][j][maxMove] >= 0) return dp[i][j][maxMove];
        
        long result = 0;
        result += dfs(m, n, maxMove - 1, i - 1 , j, dp);
        result %= 1000_000_007;
        result += dfs(m, n, maxMove - 1, i + 1 , j, dp);
        result %= 1000_000_007;
        result += dfs(m, n, maxMove - 1, i , j - 1, dp);
        result %= 1000_000_007;
        result += dfs(m, n, maxMove - 1, i , j + 1, dp);
        result %= 1000_000_007;
        dp[i][j][maxMove] = result;
        return result;
    }
}