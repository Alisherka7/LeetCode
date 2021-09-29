public class ReshapetheMatrix {
    // You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix
    // Input: mat = [[1,2],[3,4]], r = 1, c = 4
    // Output: [[1,2,3,4]]


    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int result[][] = new int[r][c];
        int rows = mat.length;
        int cols = mat[0].length;
        if(cols*rows != r*c){
            return mat;
        }
        int row = 0;
        int col = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                result[row][col++] = mat[i][j];
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;

        int[][] res = matrixReshape(mat, r, c);
        for(int i =0; i<res.length; i++){
            System.out.print("[");
            for(int j =0; j<res[i].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println("]");
        }
    }
}
