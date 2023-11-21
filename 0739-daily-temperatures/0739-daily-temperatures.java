class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                int j = s.pop();
                answer[j]=i-j;
            }
            s.push(i);
        }
        return answer;
    }
}