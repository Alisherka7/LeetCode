class Solution {
    public int minValue(int row, int col, int[][] matrix, int[][] dp) {
        if(row<0 || col <0 || col>matrix.length-1) {
            return Integer.MAX_VALUE;
        }
        if(row == 0) {
            return matrix[row][col];
        }
        if(dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }
        int left = minValue(row-1, col-1, matrix, dp);
        int mid = minValue(row-1, col, matrix, dp);
        int right = minValue(row-1, col+1, matrix, dp);

        return dp[row][col] = Math.min(left, Math.min(mid, right)) + matrix[row][col];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int [] r : dp) {
            Arrays.fill(r, Integer.MAX_VALUE);
        }
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            min = Math.min(minValue(n-1, i, matrix, dp), min);
        }

        return min;
    }
}
