# 2435. Paths in Matrix Whose Sum Is Divisible by K

You are given a 0-indexed m x n integer matrix grid and an integer k. You are currently at position (0, 0) and you want to reach position (m - 1, n - 1) moving only down or right.

Return the number of paths where the sum of the elements on the path is divisible by k. Since the answer may be very large, return it modulo 109 + 7.

 

### Example 1:
<img width="423" height="183" alt="Screenshot 2025-11-26 at 6 36 47 PM" src="https://github.com/user-attachments/assets/f769e675-bd5b-4d08-bc3b-f5f6621af393" />

```
Input: grid = [[5,2,4],[3,0,5],[0,7,2]], k = 3
Output: 2
Explanation: There are two paths where the sum of the elements on the path is divisible by k.
The first path highlighted in red has a sum of 5 + 2 + 4 + 5 + 2 = 18 which is divisible by 3.
The second path highlighted in blue has a sum of 5 + 3 + 0 + 5 + 2 = 15 which is divisible by 3.
```
### Example 2:
<img width="133" height="80" alt="Screenshot 2025-11-26 at 6 36 54 PM" src="https://github.com/user-attachments/assets/c6360ff9-aa69-4d13-a59f-9ddba6d7e8a5" />

```
Input: grid = [[0,0]], k = 5
Output: 1
Explanation: The path highlighted in red has a sum of 0 + 0 = 0 which is divisible by 5.
```
### Example 3:
<img width="236" height="181" alt="Screenshot 2025-11-26 at 6 37 03 PM" src="https://github.com/user-attachments/assets/8247d0e1-d77a-4773-8ea0-d5ab7813ffae" />

```
Input: grid = [[7,3,4,9],[2,3,6,2],[2,3,7,0]], k = 1
Output: 10
Explanation: Every integer is divisible by 1 so the sum of the elements on every possible path is divisible by k.
```

### Constraints:
```
m == grid.length
n == grid[i].length
1 <= m, n <= 5 * 10^4
1 <= m * n <= 5 * 10^4
0 <= grid[i][j] <= 100
1 <= k <= 50
```
