# 2316. Count Unreachable Pairs of Nodes in an Undirected Graph

You are given an integer n. There is an undirected graph with n nodes, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting nodes ai and bi.

Return the number of pairs of different nodes that are unreachable from each other.

 

### Example 1:
<img width="288" alt="Screen Shot 2023-03-25 at 23 29 39" src="https://user-images.githubusercontent.com/38793933/227723477-b39ff386-45c3-42e4-bb78-151de1bd8e4b.png">

```
Input: n = 3, edges = [[0,1],[0,2],[1,2]]
Output: 0
Explanation: There are no pairs of nodes that are unreachable from each other. Therefore, we return 0.
```
### Example 2:
<img width="311" alt="Screen Shot 2023-03-25 at 23 29 48" src="https://user-images.githubusercontent.com/38793933/227723490-560cb9a1-ff96-4232-a150-faa53c1f2510.png">

```
Input: n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
Output: 14
Explanation: There are 14 pairs of nodes that are unreachable from each other:
[[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6],[5,6]].
Therefore, we return 14.
```

### Constraints:
```
1 <= n <= 10^5
0 <= edges.length <= 2 * 10^5
edges[i].length == 2
0 <= a^i, b^i < n
a^i != b^i
There are no repeated edges.
```
