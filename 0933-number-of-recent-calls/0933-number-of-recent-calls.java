// class RecentCounter {

//     public RecentCounter() {
        
//     }
    
//     public int ping(int t) {
        
//     }
// }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
class RecentCounter {
    LinkedList<Integer> times;
    public RecentCounter() {
        times = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        times.add(t);
        while (times.getFirst() < t-3000) {
            times.removeFirst();
        }
        
        return times.size();
    }
}