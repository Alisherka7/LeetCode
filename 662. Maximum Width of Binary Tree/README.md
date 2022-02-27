# 662. Maximum Width of Binary Tree
Given the root of a binary tree, return the maximum width of the given tree.

The maximum width of a tree is the maximum width among all levels.

The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.

It is guaranteed that the answer will in the range of 32-bit signed integer.

 

### Example 1:
<img width="383" alt="Screen Shot 2022-02-28 at 3 21 28" src="https://user-images.githubusercontent.com/38793933/155894688-0a822b86-91d5-41b7-b005-535c0b77f639.png">

```
Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
```
### Example 2:
<img width="255" alt="Screen Shot 2022-02-28 at 3 22 06" src="https://user-images.githubusercontent.com/38793933/155894710-7444d296-6994-491d-8912-58ec42c6db39.png">

```
Input: root = [1,3,null,5,3]
Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
```
### Example 3:
<img width="321" alt="Screen Shot 2022-02-28 at 3 22 18" src="https://user-images.githubusercontent.com/38793933/155894715-04c4083d-1aeb-48c6-be94-568f10e5e08a.png">

```
Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).
```
 

### Constraints:
```
The number of nodes in the tree is in the range [1, 3000].
-100 <= Node.val <= 100
```
