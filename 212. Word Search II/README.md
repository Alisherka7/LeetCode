# 212. Word Search II
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

 

### Example 1:
<img width="328" alt="Screen Shot 2022-11-05 at 23 11 20" src="https://user-images.githubusercontent.com/38793933/200124011-74f6a0a3-1da5-4ce5-a3bc-397d10bcaee4.png">

```
Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]
```
### Example 2:
<img width="170" alt="Screen Shot 2022-11-05 at 23 11 29" src="https://user-images.githubusercontent.com/38793933/200124018-8d290dd4-ad1d-4562-a055-1f2d4520fb30.png">

```
Input: board = [["a","b"],["c","d"]], words = ["abcb"]
Output: []
```
 

Constraints:
```
m == board.length
n == board[i].length
1 <= m, n <= 12
board[i][j] is a lowercase English letter.
1 <= words.length <= 3 * 10^4
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
All the strings of words are unique.
```
