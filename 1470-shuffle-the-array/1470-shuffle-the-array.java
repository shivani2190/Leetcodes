// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans = new int[2*n];
//         int j=0;
//         for(int i =0; i<2*n;i=i+2){
//             ans[i]= nums[j];
//             ans[i+1] = nums[n+j];
//             j++;
//         }
//         return ans;
//     }
// }
class Solution{
    public int[] shuffle(int[] nums, int n){
        for(int i=0;i<n;i++){
            nums[i+n] += nums[i]*1005;
        }
        for(int i=0;i<n; i++){
            nums[2*i]= nums[i+n]/1005;
            nums[2*i+1] = nums[i+n]%1005;
        }
        return nums;
    }
}
