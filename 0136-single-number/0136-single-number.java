class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0,(a,b)->a^b);
        // a xor b for same values 1xor1=0 & 0xor0=0
    }
}