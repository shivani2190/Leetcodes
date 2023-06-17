public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        int bench = 0;
        for (int i = 0; i < 26; i++) {
            if (bench == 0) {
                if (counter[i] != 0) {
                    bench = counter[i];
                }
            } else {
                if (counter[i] != 0 && counter[i] != bench) {
                    return false;
                }
            }
        }
        return true;
    }
}