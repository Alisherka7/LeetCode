# 1579. Remove Max Number of Edges to Keep Graph Fully Traversable

Alice and Bob have an undirected graph of n nodes and three types of edges:

Type 1: Can be traversed by Alice only.
Type 2: Can be traversed by Bob only.
Type 3: Can be traversed by both Alice and Bob.
Given an array edges where edges[i] = [typei, ui, vi] represents a bidirectional edge of type typei between nodes ui and vi, find the maximum number of edges you can remove so that after removing the edges, the graph can still be fully traversed by both Alice and Bob. The graph is fully traversed by Alice and Bob if starting from any node, they can reach all other nodes.

Return the maximum number of edges you can remove, or return -1 if Alice and Bob cannot fully traverse the graph.

 

### Example 1:
<img width="194" alt="Screenshot 2024-06-30 at 9 18 34 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/1b1a7fd6-7013-4c85-ae8f-d90350828514">


```
Input: n = 4, edges = [[3,1,2],[3,2,3],[1,1,3],[1,2,4],[1,1,2],[2,3,4]]
Output: 2
Explanation: If we remove the 2 edges [1,1,2] and [1,1,3]. The graph will still be fully traversable by Alice and Bob. Removing any additional edge will not make it so. So the maximum number of edges we can remove is 2.
```
### Example 2:
<img width="210" alt="Screenshot 2024-06-30 at 9 18 41 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/60e0d7dc-ce10-4f89-bff4-26f452f39ff6">


```
Input: n = 4, edges = [[3,1,2],[3,2,3],[1,1,4],[2,1,4]]
Output: 0
Explanation: Notice that removing any edge will not make the graph fully traversable by Alice and Bob.
```
### Example 3:
<img width="218" alt="Screenshot 2024-06-30 at 9 18 49 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/6102616e-54e6-4521-8995-ad5edf0f4f59">


```
Input: n = 4, edges = [[3,2,3],[1,1,2],[2,3,4]]
Output: -1
Explanation: In the current graph, Alice cannot reach node 4 from the other nodes. Likewise, Bob cannot reach 1. Therefore it's impossible to make the graph fully traversable.
```

 

### Constraints:
```
1 <= n <= 10^5
1 <= edges.length <= min(10^5, 3 * n * (n - 1) / 2)
edges[i].length == 3
1 <= typei <= 3
1 <= ui < vi <= n
All tuples (typei, ui, vi) are distinct.
```
