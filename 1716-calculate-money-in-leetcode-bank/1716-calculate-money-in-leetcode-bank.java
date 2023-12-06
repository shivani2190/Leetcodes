class Solution {
    public int totalMoney(int n) {
        int dayvalue, weekvalue, total=0;
        for(int i=1;i<=n; i++){
            weekvalue = i/7;
            dayvalue = i%7;
            if(dayvalue == 0) dayvalue =6;
            total += weekvalue + dayvalue;
        }
        return total;
    }
}