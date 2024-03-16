class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int longest_array = 0; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                longest_array = Math.max(longest_array, i + 1); 
            } else if (h.containsKey(sum)) {
                longest_array = Math.max(longest_array, i - h.get(sum));
            } else {
                h.put(sum, i);
            }
        }
        return longest_array;
    }
}