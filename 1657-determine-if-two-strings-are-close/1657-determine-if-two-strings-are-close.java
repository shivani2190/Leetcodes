class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
       Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> n = new HashMap<>();
        for(char num : word1.toCharArray()){
            m.put(num , m.getOrDefault(num,0)+1);
        }
        for(char num : word2.toCharArray()){
            n.put(num , n.getOrDefault(num,0)+1);
        }
        if(!m.keySet().equals(n.keySet())) return false;
        List<Integer> a = new ArrayList<>(m.values());
        List<Integer> b = new ArrayList<>(n.values());
        Collections.sort(a);
        Collections.sort(b);
        return a.equals(b);
    }
}
