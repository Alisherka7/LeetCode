# 542. 01 Matrix

Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

 

### Example 1:
![Screen Shot 2023-08-17 at 20 00 48](https://github.com/Alisherka7/LeetCode/assets/38793933/053185e7-25bf-48fa-9fab-6165dea962fe)

```
Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
```
### Example 2:
![Screen Shot 2023-08-17 at 20 00 57](https://github.com/Alisherka7/LeetCode/assets/38793933/da1465c4-7183-4fbd-bc2f-da8c20e2937a)

```
Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
```

### Constraints:

```
m == mat.length
n == mat[i].length
1 <= m, n <= 10^4
1 <= m * n <= 10^4
mat[i][j] is either 0 or 1.
There is at least one 0 in mat.
```
