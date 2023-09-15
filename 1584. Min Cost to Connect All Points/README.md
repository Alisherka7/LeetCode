# 1584. Min Cost to Connect All Points


You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.

 

Example 1:
<img width="267" alt="Screen Shot 2023-09-15 at 15 30 07" src="https://github.com/Alisherka7/LeetCode/assets/38793933/9e2ae1c4-d364-4e54-9538-f6d30e16ee43">

```
Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
```
### Explanation: 
```
We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
```

### Example 2:
<img width="245" alt="Screen Shot 2023-09-15 at 15 30 19" src="https://github.com/Alisherka7/LeetCode/assets/38793933/6cadaa70-4e1d-45cf-9f00-fda2419fa50a">

```
Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18
```
 

### Constraints:
```
1 <= points.length <= 1000
-10^6 <= xi, yi <= 10^6
All pairs (xi, yi) are distinct.
```
