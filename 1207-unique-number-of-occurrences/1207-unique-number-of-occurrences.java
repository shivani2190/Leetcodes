class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> h = new HashMap();
        for(int num: arr){
            h.put(num, h.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> s = new HashSet<>(h.values());
        return h.size() == s.size();
    }
}