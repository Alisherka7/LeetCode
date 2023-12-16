class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] al = new int[26];
        for(int i =0; i<s.length(); i++){
            al[s.charAt(i) - 'a']++;
            al[t.charAt(i) - 'a']--;
        }

        for(int i =0; i<al.length; i++){
            if(al[i] != 0){
                return false;
            }
        }
        return true;
    }
}
