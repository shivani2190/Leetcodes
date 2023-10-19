class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int j=0;
        int[] arr = new int[a+b];
        for(int i=0; i<arr.length;i++){
            if(i<a){
                arr[i]=nums1[i];
            }else{
                arr[i]=nums2[j++];
            }
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (double)(arr[arr.length/2] + arr[(arr.length-1)/2])/2;
        }else{
            return (double)arr[arr.length/2];  
        }
    }
}






















































// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int m = nums1.length;
//         int n = nums2.length;
//         int[] a = new int[m+n];
//         int i=0,j=0,k=0;
//         while(i<m&&j<n){
//             if(nums1[i]<nums2[j]){
//                 a[k]=nums1[i];
//                 i++;
//             }else{
//                 a[k]=nums2[j];
//                 j++;
//             }
//             k++;
//         }   
//         //again looping for the left elements in the array after being sorted
//             while(i<m){
//                 a[k]=nums1[i];
//                 i++;
//                 k++;
//             }
//             while(j<n){
//                 a[k]=nums2[j];
//                 j++;
//                 k++;
//             }
//             if((m+n)%2!=0){
//                 return a[(m+n)/2];
//             }else{
//                 int x=(m+n)/2;
//                 double p=a[x];
//                 double q=a[x-1];
//                 return (p+q)/2;
//             }
//         }
//     }
