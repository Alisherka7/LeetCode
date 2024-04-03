# 79. Word Search

Given an `m x n` grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

### Example 1:
<img width="330" alt="Screenshot 2024-04-03 at 5 52 29 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/119e6c0e-a910-423b-8a7e-7bdec0f77272">


```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
```
### Example 2:
<img width="330" alt="Screenshot 2024-04-03 at 5 52 38 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/27eecced-bbda-4eb4-86cf-bd9bd68b7d77">


```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
```

### Example 3:
<img width="335" alt="Screenshot 2024-04-03 at 5 52 48 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/109c8324-acc1-4acb-925b-b20f2a1385cc">


```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
```

### Constraints:
```
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
```
