class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        int n = points.length;
        for(int i=1;i<n;i++){
            int[] cur = points[i];
            int[] prev = points[i-1];
            int curVal = Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
            ans += curVal;
        }
        return ans;
    }
}