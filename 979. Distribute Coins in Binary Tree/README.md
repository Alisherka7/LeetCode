# 979. Distribute Coins in Binary Tree

You are given the root of a binary tree with n nodes where each node in the tree has node.val coins. There are n coins in total throughout the whole tree.

In one move, we may choose two adjacent nodes and move one coin from one node to another. A move may be from parent to child, or from child to parent.

Return the minimum number of moves required to make every node have exactly one coin.

 

### Example 1:
<img width="252" alt="Screenshot 2024-05-18 at 9 18 35 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/8c2ad212-ea50-4faf-99de-afa5343cc369">

```
Input: root = [3,0,0]
Output: 2
Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
```
### Example 2:
<img width="259" alt="Screenshot 2024-05-18 at 9 18 46 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/f39792db-2190-43d7-a93a-99ba35f4a3b5">

```
Input: root = [0,3,0]
Output: 3
Explanation: From the left child of the root, we move two coins to the root [taking two moves]. Then, we move one coin from the root of the tree to the right child.
```
 

### Constraints:
```
The number of nodes in the tree is n.
1 <= n <= 100
0 <= Node.val <= n
The sum of all Node.val is n.
```
