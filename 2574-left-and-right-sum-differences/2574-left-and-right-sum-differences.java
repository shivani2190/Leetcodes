class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans= new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<nums.length;j++){
                if(j<i) r=r+nums[j];
                else if(j>i) l=l+nums[j];
            }
            ans[i] = Math.abs(r-l);
        }
        return ans;
    }
}