class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       Queue<Integer> q=new LinkedList<>();
       boolean visited[]=new boolean[rooms.size()];
       visited[0]=true;
       for(int x: rooms.get(0)){
         q.add(x);
         visited[x]=true;
       }
       while(!q.isEmpty()){
         int front=q.poll();
         for(int i:rooms.get(front))
         {
           if(visited[i]==false){
             q.add(i);
             visited[i]=true; 
           }
         }         
       }
       
       for(int j=0;j<visited.length;j++){
         if(visited[j]==false) return false;
       }
       
       return true; 
    }
}