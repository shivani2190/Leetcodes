class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> h = new HashMap<>();
        for(int num: arr){
            h.put(num, h.getOrDefault(num, 0)+1);//h.get is used to add occurrences but h.getOrDefault gives default 0 if no occurrence else +1 if present
        }
        HashSet<Integer> s = new HashSet<>(h.values());
        return h.size() == s.size();
    }
}