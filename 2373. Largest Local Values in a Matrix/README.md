# 2373. Largest Local Values in a Matrix

You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size `(n - 2) x (n - 2)` such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.

 

### Example 1:
<img width="378" alt="Screenshot 2024-05-12 at 6 20 57 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/dbe00b49-2cd2-419d-bd3f-99f859ef5923">

```
Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
```
### Example 2:
<img width="439" alt="Screenshot 2024-05-12 at 6 21 06 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/d3b55796-f400-4f33-8500-1cb57a953e66">

```
Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
```
 

### Constraints:
```
n == grid.length == grid[i].length
3 <= n <= 100
1 <= grid[i][j] <= 100
```
