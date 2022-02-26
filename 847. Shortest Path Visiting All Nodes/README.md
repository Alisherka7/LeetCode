# 847. Shortest Path Visiting All Nodes

You have an undirected, connected graph of n nodes labeled from 0 to n - 1. You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.

Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.

 

### Example 1:
<img width="243" alt="Screen Shot 2022-02-27 at 3 03 32" src="https://user-images.githubusercontent.com/38793933/155854170-3efe8861-e4ec-49a7-823a-4badb703ea4d.png">

```
Input: graph = [[1,2,3],[0],[0],[0]]
Output: 4
Explanation: One possible path is [1,0,2,0,3]
```
### Example 2:
<img width="395" alt="Screen Shot 2022-02-27 at 3 04 03" src="https://user-images.githubusercontent.com/38793933/155854183-293bc02f-4632-43c5-8886-a96e2d6ab685.png">

```
Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
Output: 4
Explanation: One possible path is [0,1,4,2,3]
```

### Constraints:
```
n == graph.length
1 <= n <= 12
0 <= graph[i].length < n
graph[i] does not contain i.
If graph[a] contains b, then graph[b] contains a.
The input graph is always connected.
```
