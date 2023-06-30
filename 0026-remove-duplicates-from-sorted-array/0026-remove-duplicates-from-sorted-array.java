class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int c=0;
        for(int i=0;i<k;i++){
            if(i<k-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[c]=nums[i];
            c++;
        }
        return c;
    }
}