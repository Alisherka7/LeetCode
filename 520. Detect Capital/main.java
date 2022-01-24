class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean b = true, b2 = true, b3 = true;
        
        for(int i =0; i<n; i++){
            if(!Character.isUpperCase(word.charAt(i))){
                b = false;
                break;
            }
        }
        if(b){
            return true;
        }
        // case 2: All not capital
        for (int i = 0; i < n; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                b2 = false;
                break;
            }
        }
        if(b2){
            return true;
        }
        
        // case 3: ALl not capital except first
        if(!Character.isUpperCase(word.charAt(0))){
            b3 = false;
        }
        if(b3){
            for(int i =1; i<n; i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    b3 = false;
                    break;
                }
            }
        }
        if(b3){
            return true;
        }
        return false;
    }
}
