class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int si=0;
        for(int i=0 ; i < words.size() ; i++) {
            if(si == s.length()) return false;
            if(words.get(i).charAt(0) != s.charAt(si)) return false;
            si++;
        }
        return si == s.length();
    }
}