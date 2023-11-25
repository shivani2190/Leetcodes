class Solution {
    public int equalPairs(int[][] grid) {
       HashMap<String,Integer> h=new HashMap<>();
        int n=grid.length;
        String x="";
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=grid[i][j]+"+";
            }
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=grid[j][i]+"+";
            }
            if(h.containsKey(x)){
                count+=h.get(x);
            } 
        }
        return count; 
    }
}