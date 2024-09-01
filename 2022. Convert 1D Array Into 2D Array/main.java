class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if it is possible to form an m x n 2D array
        if (m * n != original.length) {
            // If not, return an empty 2D array
            return new int[0][0];
        }

        // Initialize the result 2D array with m rows and n columns
        int[][] resultArray = new int[m][n];

        // Fill the 2D array with elements from the original array
        for (int i = 0; i < original.length; i++) {
            resultArray[i / n][i % n] = original[i];
        }

        return resultArray;
    }
}
