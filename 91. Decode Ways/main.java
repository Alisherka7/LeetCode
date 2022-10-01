class Solution {
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length()+1];
        
        dp[0] = 1;
        if(s.charAt(0) == '0'){
            dp[1] = 0;
        }else{
            dp[1] = 1;
        }
        for(int i=1; i<s.length(); i++){
            int first = 0;
            if(s.charAt(i) != '0'){
                first = dp[i];
            }
            int second = 0;
            if(10 <= Integer.parseInt(s.substring(i-1, i+1)) && Integer.parseInt(s.substring(i-1, i+1)) <= 26){
                second = dp[i-1];
            }
            dp[i+1] = first + second;
        }
        
        return dp[s.length()];
        
    }
}
