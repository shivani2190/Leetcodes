class Solution {
    private int[] nums;

    public int[] sortArray(int[] nums) {
        this.nums = nums;
        quikcSort(0, nums.length - 1);
        return nums;
    }

    private void quikcSort(int l, int r) {
        if (l >= r) {
            return;
        }
        int x = nums[(l + r) >> 1];
        int i = l - 1, j = r + 1;
        while (i < j) {
            while (nums[++i] < x) {
            }
            while (nums[--j] > x) {
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quikcSort(l, j);
        quikcSort(j + 1, r);
    }
}

// public class Solution{
//     public static void conquer(int arr[], int si, int mid, int ei){
//         int merged[]= new int[ei-si+1];
//         int idx = si;
//         int idx = mid+1;
//         int x=0;
//         while(idx1 <=mid && idx2<=ei ){
//             if(arr[idx1]<= arr[idx2]){
//                 merged [x++]=arr[idx1++];
//             }else{
//                 merged[x++]=arr[idex2++];
//             }
//         }
//         while(idx1<=mid){
//             merged[x++]=arr[idx1++];
//         }
//         while(idx2<=ei){
//             merged[x++]=arr[idx2++];
//         }
//         for(int i=0; j=si; i< merged.length ;i++;j++){
//             arr[j] = merged[i];
//         }
//         public static void divide(int arr[], int si, int ei){
//             if(si>=ei){
//                 return;
//             }
//             int mid= si+(ei-si)/2;
//             divide(arr,si,mid);
//             divide(arr,mid+1,ei);
//             conquer(arr,si,mid,ei);
//         }
//         public static void main(String args[]){
//             int arr[] = {5,2,3,1};
//             int n = arr.length;
//             divide(arr, 0,n-1);
//             for(int i=0;i<n;i++){
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }