class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(c != stack.peek()){
                    return false;
                }
                
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
