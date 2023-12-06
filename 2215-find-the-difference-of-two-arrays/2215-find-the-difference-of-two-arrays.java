class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums1) s1.add(i);
        for(int i : nums2) s2.add(i);
        for(int i : s1) if(!s2.contains(i)) a.add(i);
        for(int i : s2) if(!s1.contains(i)) b.add(i);
        ans.add(a);
        ans.add(b);
        return ans;
    }
}