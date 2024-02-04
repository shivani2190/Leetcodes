class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int K = k + 1;
        int[] dp = new int[k + 1];
        Arrays.fill(dp, 0);
        for (int start = arr.length - 1; start >= 0; start--) {
            int m = 0;
            int end = Math.min(arr.length, start + k);

            for (int i = start; i < end; i++) {
                m = Math.max(m, arr[i]);
                dp[start % K] = Math.max(dp[start % K], dp[(i + 1) % K] + m * (i - start + 1));
            }
        }
        return dp[0];
    }
}