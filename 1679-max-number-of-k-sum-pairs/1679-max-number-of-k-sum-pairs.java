class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,c=0;
        while(i<j){
            if(nums[i]+nums[j] == k){
                c++;
                i++;
                j--;
            }else if(nums[i]+nums[j] < k){
                i++;
            }
            else{
               j--; 
            }
        }
        return c;
    }
}