class Solution {
    public boolean isValid(String s) {
        Stack <Character> leftSymbol = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('|| c=='{'|| c=='['){
                leftSymbol.push(c);
            }else if(c==')' && !leftSymbol.isEmpty() && leftSymbol.peek()=='('){
                leftSymbol.pop();
            }else if(c=='}' &&!leftSymbol.isEmpty() && leftSymbol.peek()== '{'){
                leftSymbol.pop();
            }else if(c==']' && !leftSymbol.isEmpty() && leftSymbol.peek() == '['){
                leftSymbol.pop();
            }else{
                return false;
            }
        }
        return leftSymbol.isEmpty();
    }
}