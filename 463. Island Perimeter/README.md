# 463. Island Perimeter

You are given row x col grid representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 

### Example 1:
<img width="237" alt="Screenshot 2024-04-18 at 10 54 56 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/3baa2085-0a0d-40fe-beb2-413e1aca91f2">

```
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.
```
### Example 2:
```
Input: grid = [[1]]
Output: 4
```
### Example 3:
```
Input: grid = [[1,0]]
Output: 4
```
 

### Constraints:
```
row == grid.length
col == grid[i].length
1 <= row, col <= 100
grid[i][j] is 0 or 1.
There is exactly one island in grid.
```
