class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(var s: sentences){
            int c=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) ==' '){
                    ++c;
                }
            }
            m= Math.max(m,c);
        }
        return m;
}
}