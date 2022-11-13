class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = temp.length-1; i>0; i--){
            if(temp[i] != ""){
                sb.append(temp[i]);
                sb.append(" ");
            }
        }
        sb.append(temp[0]);
        return sb.toString();
    }
}
