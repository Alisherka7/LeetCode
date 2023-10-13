class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int f=cost[0],s=cost[1];
        if(n<=2) return Math.min(f,s);
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(f,s);
            f=s;
            s=curr;
        }
        return Math.min(f,s);
    }
}
