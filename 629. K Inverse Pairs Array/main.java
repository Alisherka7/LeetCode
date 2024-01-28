class Solution {
    private static final int MOD = 1000000007;

    public int kInversePairs(int n, int k) {
        int[] dp = new int[k + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int nb = 1; nb <= n; nb++) {
            int[] newDp = new int[k + 1];
            newDp[0] = 1;
            for (int kb = 1; kb <= k; kb++) {
                int val = (dp[kb] + newDp[kb - 1]) % MOD;
                if (kb >= nb) {
                    val = (val - dp[kb - nb] + MOD) % MOD;
                }
                newDp[kb] = val;
            }
            dp = newDp;
        }

        return dp[k];
    }
}
