class Solution {
    
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        set.add(n);
        int sum = n;
        while(sum!=1){
            sum = getDigitSqrSum(sum);
            if(set.contains(sum)){
                return false;
            } else {
                set.add(sum);
            }
        }
        return true;
    }
    
    private int getDigitSqrSum(int n){
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum+=(d*d);
            n=n/10;
        }
        return sum;
    }
}