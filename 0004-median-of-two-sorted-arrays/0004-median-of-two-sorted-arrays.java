class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       ArrayList<Integer> l = new ArrayList<>();
        for(int i:nums1) l.add(i);
        for(int i:nums2) l.add(i);
        Collections.sort(l);
        int n = l.size();
        return (double)(l.get((n-1)/2)+l.get(n/2))/2;
    }
}