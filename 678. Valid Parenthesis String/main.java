class Solution {
    public boolean checkValidString(String s) {
        int openCount = 0;
        int closeCount = 0;
        int length = s.length() -1;

        // Traverse the string from both end simultaneously
        for(int i =0; i<= length; i++){
            // count open parentheses or asterisks
            if(s.charAt(i) == '(' || s.charAt(i) == '*'){
                openCount++;
            }else{
                openCount--;
            }

            // Count close parentheses or asterisks
            if(s.charAt(length - i) == ')' || s.charAt(length - i) == '*'){
                closeCount++;
            }else{
                closeCount--;
            }

            if(openCount < 0 || closeCount < 0){
                return false;
            }
        }

        return true;
    }
}
