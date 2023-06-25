# 106. Construct Binary Tree from Inorder and Postorder Traversal
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

 

### Example 1:

<img width="299" alt="Screen Shot 2023-03-16 at 13 26 46" src="https://user-images.githubusercontent.com/38793933/225514384-7bba5754-f118-4f07-b506-624ee25ecc33.png">

```
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

```
### Example 2:
```
Input: inorder = [-1], postorder = [-1]
Output: [-1]
```
 

### Constraints:
```
1 <= inorder.length <= 3000
postorder.length == inorder.length
-3000 <= inorder[i], postorder[i] <= 3000
inorder and postorder consist of unique values.
Each value of postorder also appears in inorder.
inorder is guaranteed to be the inorder traversal of the tree.
postorder is guaranteed to be the postorder traversal of the tree.
```
