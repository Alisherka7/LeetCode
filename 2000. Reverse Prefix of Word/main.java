class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        if(ind == -1){
            return word;
        }

        // reverse string
        String nstr="";
        for (int i=0; i<ind+1; i++){
            ch= word.charAt(i); 
            nstr= ch+nstr;
        }

        nstr += word.substring(ind+1, word.length());
        return nstr;
    }
}
