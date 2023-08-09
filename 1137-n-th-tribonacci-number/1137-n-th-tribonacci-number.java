class Solution {
    public int tribonacci(int n) {
        if ( n == 0 ) return 0;
        if (n==1 || n==2) return 1;
        int tribonacci_numbers[] = new int[n+1];
        tribonacci_numbers[0] = 0;
        tribonacci_numbers[1] = 1;
        tribonacci_numbers[2] = 1;
        for(int i=3;i<=n;i++){
            tribonacci_numbers[i] = tribonacci_numbers[i-1] +tribonacci_numbers[i-2] +tribonacci_numbers[i-3];
        }
        return tribonacci_numbers[n];
    }
}