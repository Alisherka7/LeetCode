class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int sNum = st.pop();
                int fNum = st.pop();
                st.push(fNum + sNum);
            }
            else if(tokens[i].equals("-")){
                int sNum = st.pop();
                int fNum = st.pop();
                st.push(fNum - sNum);
            }
            else if(tokens[i].equals("/")){
                int sNum = st.pop();
                int fNum = st.pop();
                if(fNum == 0 || sNum == 0){
                    st.push(0);
                }else{
                    st.push(fNum / sNum);
                }
            
            }
            else if(tokens[i].equals("*")){
                int sNum = st.pop();
                int fNum = st.pop();
                st.push(fNum * sNum);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
