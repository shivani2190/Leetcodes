class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            ans1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            ans2.append(word2[i]);
        }
        if(ans1.toString().equals(ans2.toString())) 
            return true;
        else return false;
    }
}