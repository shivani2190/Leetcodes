class Solution {
    public int minOperations(String s) {
        int swaps = 0;
    for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0)
            swaps += s.charAt(i) == '0' ? 0 : 1;
        else
            swaps += s.charAt(i) == '1' ? 0 : 1;
    }
    return Math.min(swaps, s.length() - swaps);
    }
}