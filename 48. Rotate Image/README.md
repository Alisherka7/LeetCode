# 48. Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

### Example 1:
<img width="515" alt="Screen Shot 2022-08-30 at 19 28 55" src="https://user-images.githubusercontent.com/38793933/187414495-02e3198b-3b3e-4ae7-8c8f-dc7319c357f4.png">

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
```
### Example 2:
<img width="515" alt="Screen Shot 2022-08-30 at 19 29 04" src="https://user-images.githubusercontent.com/38793933/187414525-0c568698-67a8-4175-98cf-2ac536bb9b58.png">

```
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
```
 

### Constraints:
```
n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
```
