class Solution {
    public int rangeBitwiseAnd(int left, int right) {
         while (left < right) {
            // Perform bitwise AND operation
            right &= (right - 1);
        }
        // Return the result
        return right;
    }
}
