# 590. N-ary Tree Postorder Traversal

Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

 

### Example 1:
![Screenshot 2024-08-26 at 7 06 31 PM](https://github.com/user-attachments/assets/03280fec-8933-4bb6-8c58-435099b25b23)

```
Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]
```
### Example 2:
![Screenshot 2024-08-26 at 7 06 39 PM](https://github.com/user-attachments/assets/d382b2dd-07c5-4e2c-84ab-9fb6ca4cc2a2)

```
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
```

### Constraints:
```
The number of nodes in the tree is in the range [0, 10^4].
0 <= Node.val <= 104
The height of the n-ary tree is less than or equal to 1000.
```
