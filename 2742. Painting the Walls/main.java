class Solution { 
    public int solve(int[] cost,int[] time,int curr,int wallRemain,int[][] dp){
        if(wallRemain <= 0){
            return 0;
        }
        if(curr >= cost.length){
            return 2000000000;
        }
        if(dp[curr][wallRemain] != -1){
            return dp[curr][wallRemain];
        }
        int Paint = cost[curr] + solve(cost,time,curr+1,wallRemain - time[curr] - 1,dp);
        int noPaint = solve(cost,time,curr+1,wallRemain,dp);
        return dp[curr][wallRemain] = Math.min(Paint,noPaint);
    }

    public int paintWalls(int[] cost, int[] time) {
    int[][] dp = new int[501][501];
    
    for(int i=0; i<cost.length+1; i++){
        Arrays.fill(dp[i],-1);
    }
    return solve(cost,time,0,cost.length,dp); 
    }

}
