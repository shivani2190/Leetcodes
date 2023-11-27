class Solution {
    public int minFlips(int a, int b, int c) {
        int flip = 0;
        for(int bits= 0 ; bits < 31; bits++){
            int abit = (a >> bits) & 1;
            int bbit = (b >> bits) & 1;
            int cbit = (c >> bits) & 1;
           if(cbit == 0){
               if(abit == 1){
                   flip++;
               }
               if(bbit == 1){
                   flip++;
               }
           }
           else if((abit | bbit) == 0){
                 flip++;              
           }
        }
        return flip;
    }
}