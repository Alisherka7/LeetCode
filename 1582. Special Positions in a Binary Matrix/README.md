# 1582. Special Position in a Binary Matrix

Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if `mat[i][j] == 1` and all other elements in `row i and column j are 0 (rows and columns are 0-indexed)`.

 

### Example 1:
<img width="255" alt="Screen Shot 2022-10-07 at 23 34 15" src="https://user-images.githubusercontent.com/38793933/194578849-89d6e0c0-f4d5-43f3-8527-0ded0b778844.png">

```
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
```
### Example 2:
<img width="255" alt="Screen Shot 2022-10-07 at 23 34 25" src="https://user-images.githubusercontent.com/38793933/194578884-340a7c3b-b188-4925-a1fb-cb89de09e434.png">

```
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
```

### Constraints:
```
m == mat.length
n == mat[i].length
1 <= m, n <= 100
mat[i][j] is either 0 or 1.
```
