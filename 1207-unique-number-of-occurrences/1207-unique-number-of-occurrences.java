class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> uniqueCounts = new HashSet<>();
        for (int num : arr) {
            if (count.containsKey(num)) 
                count.put(num, count.get(num) + 1);
            else 
                count.put(num, 1);
        }
        for (int frq : count.values()) {
            if (!uniqueCounts.add(frq))
                return false;
        }
        return true;  
    }
}