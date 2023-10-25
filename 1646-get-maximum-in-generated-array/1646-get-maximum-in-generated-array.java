class Solution {
    public int getMaximumGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            nums[i] = i % 2 == 0 ? nums[i >> 1] : nums[i >> 1] + nums[(i >> 1) + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}




































// int[] nums = new int[n+1];
//         if(n<2) return n ;
//         nums[0]=0;
//         nums[1]=1;
//         for(int i=1;i<=n;i++){
//             if(2*i<=n) nums[2*i] = nums[i];
//             else if(2*i+1<=n) nums[2*i+1]= nums[i] + nums[i+1];
//         // }