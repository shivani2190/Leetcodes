class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> l = new ArrayList<>();
        int[] r= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            l.add(index[i], nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            r[i]=l.get(i);
        }
        return r;
    }
}