class Solution {
    public int[] decompressRLElist(int[] nums) {
        int f=0;
        for(int i=0; i<nums.length;i+=2){
            f+= nums[i];
        }
        int[] ans = new int[f];
        int startindex=0;
        for(int i=0;i<nums.length;i+=2){
            Arrays.fill(ans,startindex, startindex+nums[i], nums[i+1]);
            startindex+=nums[i];
        }
        return ans;
    }
}