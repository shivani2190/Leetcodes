class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] t=new int[dist.length];
      for(int i=0;i<dist.length;i++){
          t[i] = dist[i]/speed[i]+(dist[i]%speed[i]==0 ? 0:1);
      } 
         Arrays.sort(t);
        for(int i=0;i<t.length;i++){
            if(t[i]<=i) return i;
        }
        return dist.length;
    }
}