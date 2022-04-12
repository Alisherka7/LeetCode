# 289. Game of Life
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.

 

### Example 1:
<img width="574" alt="Screen Shot 2022-04-12 at 16 04 23" src="https://user-images.githubusercontent.com/38793933/162900594-bf31ab10-0b86-4f5f-b7c2-181014c8e6b5.png">

```
Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
```
### Example 2:
<img width="421" alt="Screen Shot 2022-04-12 at 16 04 31" src="https://user-images.githubusercontent.com/38793933/162900615-e0efb224-4873-4bed-a45d-55ca7f898df7.png">

```
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
```

### Constraints:
```
m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] is 0 or 1.
```
