class Solution {
    public void reverseString(char[] s) {
        
        int i = 0;
        int j = s.length - 1;
        char temp = 'a';
        while(i != j && j != i - 1){
            
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i += 1;
            j -= 1;
            
        }
        return;
    }
}
