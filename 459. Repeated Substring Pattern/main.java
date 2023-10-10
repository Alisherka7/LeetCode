class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1){
            return false;
        }

        int[] pi = new int[s.length()];
        int j =0;
        for(int i =1; i<s.length(); i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = pi[j-1];
            }

            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            pi[i] = j;
        }
       int lastPiValue = pi[s.length() - 1];
        
        // Check if the pattern is true or false
       return lastPiValue > 0 && (s.length() % (s.length() - lastPiValue)) == 0;
    }
}
