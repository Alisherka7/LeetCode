class Solution {
    // Up, down, right, left
    int directions[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Check for null
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;
        
        int rows = matrix.length, cols = matrix[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        
        // DFS for rows
        for(int row = 0; row < rows; row++){
            dfs(matrix, row, 0, Integer.MIN_VALUE, pacific);
            dfs(matrix, row, cols - 1, Integer.MIN_VALUE, atlantic);
        }
        
        // DFS for cols
        for(int col = 0; col < cols; col++){
            dfs(matrix, 0, col, Integer.MIN_VALUE, pacific);
            dfs(matrix, rows - 1, col, Integer.MIN_VALUE, atlantic);
        }
        
        // Fill the result
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++) {
                if(pacific[row][col] && atlantic[row][col]) {
                    result.add(Arrays.asList(row, col));
                }
            }
        }
        
        return result;
    }
    
    public void dfs(int[][] matrix, int row, int col, int prev, boolean[][] ocean){
        // Check for out-of-bounds
        if(row < 0 || row >= ocean.length || col < 0 || col >= ocean[0].length) return;
        
        // Check if water can even flow, and if this cell has not been visited yet
        if(matrix[row][col] < prev || ocean[row][col]) return;
        
        // Mark this cell as visited
        ocean[row][col] = true;
        
        // Explore in each direction
        for(int[] direction: directions){
            dfs(matrix, row + direction[0], col + direction[1], matrix[row][col], ocean);
        }
        
    }
}
