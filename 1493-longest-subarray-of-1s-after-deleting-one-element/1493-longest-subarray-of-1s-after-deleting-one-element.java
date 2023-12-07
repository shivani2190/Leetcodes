class Solution {
    public int longestSubarray(int[] nums) {
        int previous = 0, c = 0, max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){ c++; }
            else {
                max = Math.max(max, c + previous);
                previous = c;
                c=0;
            }
        }
        max = Math.max(max,c + previous);
        return max == nums.length ? max-1: max;
    }
}