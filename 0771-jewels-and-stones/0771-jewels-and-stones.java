class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int s=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                  s++;  
                } 
            }
        }
        return s;
    }
}