class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i < n+1; ++i)
        {
            for(int j = 0; j < m+1; ++j)
            {
                if(i == 0 || j == 0)dp[i][j] = 0;
            }
        }
        for(int i = 1; i < n+1; ++i)
        {
            for(int j = 1; j < m+1; ++j)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int i = n, j = m;
        StringBuilder sb = new StringBuilder();
        
        while(i != 0 && j != 0)
        {
            if(text1.charAt(i-1) == text2.charAt(j-1)){
                sb.append(text1.charAt(i-1));
                --i;
                --j;
            }
            else{
                if(dp[i-1][j] > dp[i][j-1])
                {
                    --i;
                }
                else
                {
                    --j;
                }
            }
        }
    
        System.out.println(sb.reverse().toString());
        return dp[n][m];
    }
}
