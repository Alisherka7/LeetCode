class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!v.contains(String.valueOf(ch[i]))) i++;
            if(!v.contains(String.valueOf(ch[j]))) j--;
            
            if(v.contains(String.valueOf(ch[i]))&& v.contains(String.valueOf(ch[j]))){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] =temp;
                i++;j--;
            }
        }
        return String.valueOf(ch);
    }
}
