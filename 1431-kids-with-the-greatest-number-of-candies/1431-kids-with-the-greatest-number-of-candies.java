class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max=0;
        for(int i=0;i<candies.length;i++){
           max=Math.max(max,candies[i]); 
        }
        for(int i=0;i<candies.length;i++){
            int sum = candies[i] + extraCandies;
            if(sum>=max) {
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}












// List<Boolean> ans = new ArrayList<>(candies.length);
//         int maxi=0;
//         for(int i=0; i<candies.length;i++){
//             maxi= Math.max(maxi,candies[i]);
//         }
//         for(int i : candies){
//             ans.add(i>=maxi-extraCandies);
//         }
//         return ans;