# 1496. Path Crossing

Given a string path, where `path[i] = 'N', 'S', 'E' or 'W'`, each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

 

### Example 1:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/05e63b5e-64d5-40bf-9801-381c8869e11d)

```
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.
```
### Example 2:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/375cd694-18dd-49a7-8fd3-6108ad4c79b2)

```
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
```
 

### Constraints:
```
1 <= path.length <= 104
path[i] is either 'N', 'S', 'E', or 'W'.
```
