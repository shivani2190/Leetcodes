class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int a= str1.length();
        int b= str2.length();
        int min = Math.min(a,b);
           int gcd=1;
           for(int i=2;i<=min;i++){
               if(a%i==0 && b%i==0){
                   gcd =i;
               }
           }
           return str1.substring(0,gcd);
    }
}