# 1578. Minimum Time to Make Rope Colorful

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.

### Example 1:
<img width="403" alt="Screen Shot 2022-10-04 at 0 05 06" src="https://user-images.githubusercontent.com/38793933/193611068-55011ad2-eb8e-42ce-bfd9-34dd74c3d05a.png">

```
Input: colors = "abaac", neededTime = [1,2,3,4,5]
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3.
```
### Example 2:
<img width="241" alt="Screen Shot 2022-10-04 at 0 05 20" src="https://user-images.githubusercontent.com/38793933/193611137-7daff791-4424-4cf1-9ef0-bd03b01f8980.png">

```
Input: colors = "abc", neededTime = [1,2,3]
Output: 0
Explanation: The rope is already colorful. Bob does not need to remove any balloons from the rope.
```
### Example 3:
<img width="405" alt="Screen Shot 2022-10-04 at 0 05 32" src="https://user-images.githubusercontent.com/38793933/193611175-37310361-e1f7-4781-b1ee-d8dcba7439f3.png">

```
Input: colors = "aabaa", neededTime = [1,2,3,4,1]
Output: 2
Explanation: Bob will remove the ballons at indices 0 and 4. Each ballon takes 1 second to remove.
There are no longer two consecutive balloons of the same color. Total time = 1 + 1 = 2.
```

### Constraints:
```
n == colors.length == neededTime.length
1 <= n <= 10^5
1 <= neededTime[i] <= 10^4
colors contains only lowercase English letters.
```
