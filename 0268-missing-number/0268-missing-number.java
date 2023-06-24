// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int s1= n*(n+1)/2;
//         int s2=0;
//         for(int i=0;i<n;i++){
//             s2+=nums[i];
//         }
//         return s1-s2;
//     }
// }
 class Solution{
     public int missingNumber(int[] nums){
         Set<Integer> h= new HashSet<>();
         for(int n : nums){
             h.add(n);
         }
         int l=nums.length+1;
         for(int i=0;i<l;i++){
             if(!h.contains(i)){
                 return i;
             }
         }
         return -1;
     }
 }