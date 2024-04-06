class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i =0;
        for(char c : s.toCharArray()){
            if(c == '('){
                sb.append(c);
                st.push(i);
                i++;
            }else if(!st.isEmpty() && c == ')'){
                sb.append(c);
                st.pop();
                i++;
            }else if(c!=')'){
                sb.append(c);
                i++;
            }
        }

        while(!st.isEmpty()){
            sb.deleteCharAt(st.pop());
        }
        
        return sb.toString();
    }
}
