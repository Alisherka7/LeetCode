class Solution {
	int[][]dp; 
	public int change(int amount, int[] coins) {
		dp=new int[coins.length+1][amount+1];
		int n=coins.length;
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=1;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=amount;j++)
			{
				if(coins[i-1]<=j)
				{
					dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
				}
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		return dp[n][amount];
	}
}
