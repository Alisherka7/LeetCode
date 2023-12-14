class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];
        Map<Integer, int[]> row_map = new HashMap<>();
        Map<Integer, int[]> col_map = new HashMap<>();
        for(int i = 0; i < m; i++){
            int row0 = 0;
            int row1 = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    row0++;
                }
                if(grid[i][j] == 1){
                    row1++;
                }
            }
            row_map.put(i, new int[]{row0, row1});
        }
        for(int j = 0; j < n; j++){
            int col0 = 0;
            int col1 = 0;
            for(int i = 0; i < m; i++){
                if(grid[i][j] == 0){
                    col0++;
                }
                if(grid[i][j] == 1){
                    col1++;
                }
            }
            col_map.put(j, new int[]{col0, col1});
        }
        for(int i = 0; i < m; i++){
            int[] row0and1 = row_map.get(i);
            int row0 = row0and1[0];
            int row1 = row0and1[1];
            for(int j = 0; j < n; j++){
                int[] col0and1 = col_map.get(j);
                int col0 = col0and1[0];
                int col1 = col0and1[1];
                result[i][j] = row1 + col1 - row0 - col0;
            }
        }
        return result;
    }
}
