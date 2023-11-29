class Solution {
    public int compress(char[] chars) {
       StringBuilder ans = new StringBuilder();
        int c=1;
        ans.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;
            }
            if(chars[i-1]!=chars[i]){
                if(c>1)
                    ans.append(c);
                    ans.append(chars[i]);
                    c=1;
            }
        }
            if(c>1) ans.append(c);
               for(int i=0;i<ans.length();i++){
                   chars[i]= ans.charAt(i);
               }
        return ans.length(); 
    }
}
