# 931. Minimum Falling Path Sum

Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally `left/right`. Specifically, the next element from position `(row, col)` will be `(row + 1, col - 1)`, `(row + 1, col), or (row + 1, col + 1)`.

 

### Example 1:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/27d74e24-1ca3-44a6-80c8-3afae8136f22)

```
Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum as shown.
```
### Example 2:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/905ca680-7431-47d4-a4b1-036cf15a4ad3)

```
Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is shown.
```

### Constraints:
```
n == matrix.length == matrix[i].length
1 <= n <= 100
-100 <= matrix[i][j] <= 100
```
