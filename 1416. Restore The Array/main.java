class Solution {

    Integer[] dp = new Integer[100_000];
    public int numberOfArrays(String s, int k) {
        return helper(s, k, 0);
    }
    
    public int helper(String s, int k, int idx) {
        if (idx == s.length())  return 1;
        if (dp[idx] != null)  return dp[idx];
        if (s.charAt(idx) == '0')  return 0;
        
        int answer = 0;
        for (int i = idx + 1; i <= s.length(); i++) {
            long num = convert(s.substring(idx, i));
            if (num > k) {
                break;
            }
            answer = (answer + helper(s, k, i)) % 1_000_000_007;
        }
        return dp[idx] = answer;
    }
    
    public long convert(String s) {
        long num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = num * 10 + s.charAt(i) - '0';
        }
        return num;
    }
    
}
