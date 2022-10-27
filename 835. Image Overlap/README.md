# 835. Image Overlap

You are given two images, img1 and img2, represented as binary, square matrices of size n x n. A binary matrix has only 0s and 1s as values.

We translate one image however we choose by sliding all the 1 bits left, right, up, and/or down any number of units. We then place it on top of the other image. We can then calculate the overlap by counting the number of positions that have a 1 in both images.

Note also that a translation does not include any kind of rotation. Any 1 bits that are translated outside of the matrix borders are erased.

Return the largest possible overlap.

 

### Example 1:
<img width="471" alt="Screen Shot 2022-10-27 at 12 02 19" src="https://user-images.githubusercontent.com/38793933/198181007-c6e63c38-4053-4f2f-b696-57783e9fc960.png">

```
Input: img1 = [[1,1,0],[0,1,0],[0,1,0]], img2 = [[0,0,0],[0,1,1],[0,0,1]]
Output: 3
Explanation: We translate img1 to right by 1 unit and down by 1 unit.
```

<img width="472" alt="Screen Shot 2022-10-27 at 12 02 30" src="https://user-images.githubusercontent.com/38793933/198181028-d8db4435-976d-4fb4-9536-dec94cf14e80.png">

```
The number of positions that have a 1 in both images is 3 (shown in red).
```

<img width="494" alt="Screen Shot 2022-10-27 at 12 02 41" src="https://user-images.githubusercontent.com/38793933/198181051-c4af654b-7746-4a21-964d-dcfcd49fa937.png">

### Example 2:
```
Input: img1 = [[1]], img2 = [[1]]
Output: 1
```
### Example 3:
```
Input: img1 = [[0]], img2 = [[0]]
Output: 0
```

### Constraints:
```
n == img1.length == img1[i].length
n == img2.length == img2[i].length
1 <= n <= 30
img1[i][j] is either 0 or 1.
img2[i][j] is either 0 or 1.
```
