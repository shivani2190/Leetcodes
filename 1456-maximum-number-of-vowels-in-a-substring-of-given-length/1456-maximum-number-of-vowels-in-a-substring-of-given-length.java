class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
           if(vowel(s.charAt(i))) c++; 
        }
        int ans = c;
        for(int i=k;i<s.length();i++){
           if(vowel(s.charAt(i))) c++;
           if(vowel(s.charAt(i-k))) c--;
            ans = Math.max(ans,c);
        }
        return ans;
    }
        static boolean vowel(char c){
            if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') return true;
            return false;
    }
}