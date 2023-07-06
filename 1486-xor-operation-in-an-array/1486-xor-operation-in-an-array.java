class Solution {
    public int xorOperation(int n, int start) {
       int[] nums = new int[n];
       for(int i=0;i<nums.length;i++){
           nums[i] = start +(2*i);
       }
        
       int xor = 0;
       //0^2^4^6^10 = 8
       for(int i=0;i<nums.length;i++){
           xor = xor^nums[i];
       }
       
       return xor;
    }
}