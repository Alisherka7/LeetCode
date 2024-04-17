# 988. Smallest String Starting From Leaf

You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.

Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

As a reminder, any shorter prefix of a string is lexicographically smaller.

For example, "ab" is lexicographically smaller than "aba".
A leaf of a node is a node that has no children.

 

### Example 1:
<img width="536" alt="Screenshot 2024-04-17 at 5 23 05 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/097d6b34-49a6-409b-8b4d-8340da928178">

```
Input: root = [0,1,2,3,4,3,4]
Output: "dba"
```
### Example 2:
<img width="538" alt="Screenshot 2024-04-17 at 5 23 16 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/0119b5bb-78d2-48db-93e8-bace98a51450">

```
Input: root = [25,1,3,1,3,0,2]
Output: "adz"
```

### Example 3:
<img width="471" alt="Screenshot 2024-04-17 at 5 23 34 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/dc725fc8-017f-4d3c-96a3-098c80304c43">

```
Input: root = [2,2,1,null,1,0,null,0]
Output: "abc"
```

### Constraints:
```
The number of nodes in the tree is in the range [1, 8500].
0 <= Node.val <= 25
```
