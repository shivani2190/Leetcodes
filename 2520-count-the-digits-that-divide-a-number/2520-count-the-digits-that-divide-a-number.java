class Solution {
    public int countDigits(int num) {
        int temp = num, c=0;
        while(temp!=0){
            int rem = temp%10;
            if(num%rem==0){
                c++;
            }
            temp=temp/10;
        }
        return c;
    }
}