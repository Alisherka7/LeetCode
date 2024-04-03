class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == word.charAt(0)){                                       
                    if(dfs(board, i, j, word, 0, visited))
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, int i, int j, String word, int posChar, boolean[][] visited ){
        

        
        if(j<0 || i<0 || i==board.length || j==board[0].length || visited[i][j]==true ||  board[i][j]!= word.charAt(posChar)){
            return false;
        } 
        visited[i][j]=true;
        
        if(posChar == word.length()-1){
          return true;
        }
        
        boolean isFind = dfs(board, i+1,j, word, posChar+1, visited ) ||  
            dfs(board, i,j+1, word, posChar+1, visited) || 
            dfs(board, i-1,j, word, posChar+1, visited) || 
            dfs(board, i,j-1, word, posChar+1, visited);
        
        visited[i][j]=false;
        
        
        return  isFind;
        
    }
}
