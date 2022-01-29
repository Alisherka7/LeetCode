# 84. Largest Rectangle in Histogram

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

<img width="534" alt="Screen Shot 2022-01-29 at 10 27 19" src="https://user-images.githubusercontent.com/38793933/151641937-8b9387a9-c9ac-46d4-88c8-9edb314046cc.png">


```
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
```

<img width="555" alt="Screen Shot 2022-01-29 at 10 27 41" src="https://user-images.githubusercontent.com/38793933/151641951-4333c6e0-e77e-48d1-bb61-0047a4a7516f.png">

```
Input: heights = [2,4]
Output: 4
```

### Constraints:
```
1 <= heights.length <= 105
0 <= heights[i] <= 104
```
