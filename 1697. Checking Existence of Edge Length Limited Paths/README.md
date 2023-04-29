# 1697. Checking Existence of Edge Length Limited Paths

An undirected graph of n nodes is defined by edgeList, where edgeList[i] = [ui, vi, disi] denotes an edge between nodes ui and vi with distance disi. Note that there may be multiple edges between two nodes.

Given an array queries, where queries[j] = [pj, qj, limitj], your task is to determine for each queries[j] whether there is a path between pj and qj such that each edge on the path has a distance strictly less than limitj .

Return a boolean array answer, where answer.length == queries.length and the jth value of answer is true if there is a path for queries[j] is true, and false otherwise.

 

### Example 1:
<img width="253" alt="Screen Shot 2023-04-29 at 16 50 40" src="https://user-images.githubusercontent.com/38793933/235291503-a969741a-7712-4feb-9f08-74bac88dfd20.png">

```
Input: n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
Output: [false,true]
Explanation: The above figure shows the given graph. Note that there are two overlapping edges between 0 and 1 with distances 2 and 16.
For the first query, between 0 and 1 there is no path where each distance is less than 2, thus we return false for this query.
For the second query, there is a path (0 -> 1 -> 2) of two edges with distances less than 5, thus we return true for this query.
```

### Example 2:
<img width="371" alt="Screen Shot 2023-04-29 at 16 50 51" src="https://user-images.githubusercontent.com/38793933/235291511-e414e571-4443-4437-8f50-2adc3f1e6b40.png">

```
Input: n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
Output: [true,false]
Exaplanation: The above figure shows the given graph.
``` 

### Constraints:
```
2 <= n <= 10^5
1 <= edgeList.length, queries.length <= 10^5
edgeList[i].length == 3
queries[j].length == 3
0 <= u^i, v^i, p^j, q^j <= n - 1
u^i != v^i
p^j != q^j
1 <= disi, limitj <= 10^9
There may be multiple edges between two nodes.
```
