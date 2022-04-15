# 669. Trim a Binary Search Tree

Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.

 

### Example 1:
<img width="489" alt="Screen Shot 2022-04-15 at 23 28 50" src="https://user-images.githubusercontent.com/38793933/163583015-f793972c-1ba7-4420-b800-1a1399b58ad4.png">

```
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]
```
### Example 2:
<img width="493" alt="Screen Shot 2022-04-15 at 23 29 01" src="https://user-images.githubusercontent.com/38793933/163583036-4cda7f8b-cb2e-4ae5-8fdc-334369e2edd5.png">

```
Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
Output: [3,2,null,1]
```

### Constraints:
```
The number of nodes in the tree in the range [1, 10^4].
0 <= Node.val <= 10^4
The value of each node in the tree is unique.
root is guaranteed to be a valid binary search tree.
0 <= low <= high <= 10^4
```
