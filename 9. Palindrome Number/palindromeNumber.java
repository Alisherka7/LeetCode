class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int curr = x;
        if(x < 0){
            return false;
        }
        
        while(curr > 0){
            int pop = curr % 10;
            curr/=10;
            if(rev < Integer.MAX_VALUE || (rev == Integer.MAX_VALUE && pop <= Integer.MAX_VALUE%10)){
                rev = rev * 10 + pop;
            }else{
                return false;
            }
        }
        return rev == x;
    }
}
