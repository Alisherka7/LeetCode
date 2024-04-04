class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push('(');
                maxDepth = Math.max(maxDepth, st.size());
            }else if(c == ')'){
                st.pop();
            }
        }

        return maxDepth;
    }
}
