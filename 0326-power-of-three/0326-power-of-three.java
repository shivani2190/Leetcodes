class Solution {
    public boolean isPowerOfThree(int n) {
    int c=0;
    boolean x=false;
    if(n!=0){
    while(c==0){
        if(n==1){
            x=true;
            break;
        }
        c=n%3;
        n=n/3;
    }
    }
    return x;
    }
}