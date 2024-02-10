class Solution {

    int[][] dp;

    int isPalin(String s, int i, int j) {
        if (i >= j) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = s.charAt(i) == s.charAt(j) ? isPalin(s, i+1, j-1) : 0;
    }

    public int countSubstrings(String s) {
        dp = new int[s.length()][s.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                count += isPalin(s, i, j);
            }
        }
        return count;
    }
}
