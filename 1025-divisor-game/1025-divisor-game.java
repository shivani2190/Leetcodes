class Solution {
    public boolean divisorGame(int n) {
        int count = 0;
        boolean valid = true;
        while(valid) {
            valid = false;
            for(int x = 1; x < n; x++) {
                if(n % x == 0) {
                    n = n - x;
                    count++;
                    valid = true;
                    break;
                }
            }
        }
        return (count % 2 == 1);
    }
}