class Solution {
    public String firstPalindrome(String[] words) {
        for(String c : words){
            if(c.equals(new StringBuilder(c).reverse().toString())) return c;
        }
        return "";
    }
}