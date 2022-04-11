# 1260. Shift 2D Grid
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

### Example 1:
<img width="394" alt="Screen Shot 2022-04-11 at 20 51 53" src="https://user-images.githubusercontent.com/38793933/162733848-8c333f20-0b96-47e9-ba12-c62aa27a4d28.png">

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]
```
### Example 2:
<img width="400" alt="Screen Shot 2022-04-11 at 20 52 04" src="https://user-images.githubusercontent.com/38793933/162733874-a243d247-0a28-456d-a188-c712642cef58.png">

```
Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
```
### Example 3:
```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]
```

### Constraints:
```
  m == grid.length
  n == grid[i].length
  1 <= m <= 50
  1 <= n <= 50
  -1000 <= grid[i][j] <= 1000
  0 <= k <= 100
```
