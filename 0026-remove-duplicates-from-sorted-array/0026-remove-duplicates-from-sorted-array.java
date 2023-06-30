class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int c=0;
        for(int i=0;i<k;i++){
            // If the current element is equal to the next element, we skip
            if(i<k-1 && nums[i]==nums[i+1]){
                continue;
            }
            // We will update the array in place
            nums[c]=nums[i];
            c++;
        }
        return c;
    }
}