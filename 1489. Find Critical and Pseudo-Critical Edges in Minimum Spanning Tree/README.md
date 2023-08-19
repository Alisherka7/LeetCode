# 1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree

Given a weighted undirected connected graph with n vertices numbered from 0 to n - 1, and an array edges where edges[i] = [ai, bi, weighti] represents a bidirectional and weighted edge between nodes ai and bi. A minimum spanning tree (MST) is a subset of the graph's edges that connects all vertices without cycles and with the minimum possible total edge weight.

Find all the critical and pseudo-critical edges in the given graph's minimum spanning tree (MST). An MST edge whose deletion from the graph would cause the MST weight to increase is called a critical edge. On the other hand, a pseudo-critical edge is that which can appear in some MSTs but not all.

Note that you can return the indices of the edges in any order.

 

### Example 1:
<img width="281" alt="Screen Shot 2023-08-19 at 21 25 18" src="https://github.com/Alisherka7/LeetCode/assets/38793933/43057cff-f026-4708-89dd-34f7538c4ee1">


```
Input: n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
Output: [[0,1],[2,3,4,5]]
Explanation: The figure above describes the graph.
The following figure shows all the possible MSTs:
```

<img width="596" alt="Screen Shot 2023-08-19 at 21 25 30" src="https://github.com/Alisherka7/LeetCode/assets/38793933/07b6a37a-46fa-408d-97e1-f4069b2bea44">

> Notice that the two edges 0 and 1 appear in all MSTs, therefore they are critical edges, so we return them in the first list of the output.
The edges 2, 3, 4, and 5 are only part of some MSTs, therefore they are considered pseudo-critical edges. We add them to the second list of the output.

### Example 2:
<img width="265" alt="Screen Shot 2023-08-19 at 21 26 19" src="https://github.com/Alisherka7/LeetCode/assets/38793933/543f3d8f-08de-4c23-9a07-86e45ba56b0a">

```
Input: n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
Output: [[],[0,1,2,3]]
Explanation: We can observe that since all 4 edges have equal weight, choosing any 3 edges from the given 4 will yield an MST. Therefore all 4 edges are pseudo-critical.
```

### Constraints:
```
2 <= n <= 100
1 <= edges.length <= min(200, n * (n - 1) / 2)
edges[i].length == 3
0 <= a^i < b^i < n
1 <= weighti <= 1000
All pairs (a^i, b^i) are distinct.
```
