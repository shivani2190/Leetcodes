
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                s.push(a + b);
            } 
            else if(i.equals("-")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                s.push(b - a);
            } 
            else if(i.equals("*")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                s.push(b * a);
            } 
            else if(i.equals("/")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                s.push(b / a);
            }
            else {
                s.push(Integer.parseInt(i));
            }
        }
        return s.peek();
    }
}
