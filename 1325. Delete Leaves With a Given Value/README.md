# 1325. Delete Leaves With a Given Value

Given a binary tree root and an integer target, delete all the leaf nodes with value target.

Note that once you delete a leaf node with value target, if its parent node becomes a leaf node and has the value target, it should also be deleted (you need to continue doing that until you cannot).

 

### Example 1:
<img width="514" alt="Screenshot 2024-05-17 at 11 54 29 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/d9c163f5-a972-4430-b957-cee97839103a">


```
Input: root = [1,2,3,2,null,2,4], target = 2
Output: [1,null,3,null,4]
Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left). 
After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
```
### Example 2:
<img width="407" alt="Screenshot 2024-05-17 at 11 54 37 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/685e2108-65ec-4d59-860e-5756831d94a1">


```
Input: root = [1,3,3,3,2], target = 3
Output: [1,3,null,null,2]
```
### Example 3:
<img width="507" alt="Screenshot 2024-05-17 at 11 54 49 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/8640f5a0-8eba-49cd-91bd-24e82d25f175">


```
Input: root = [1,2,null,2,null,2], target = 2
Output: [1]
Explanation: Leaf nodes in green with value (target = 2) are removed at each step.
```

### Constraints:
```
The number of nodes in the tree is in the range [1, 3000].
1 <= Node.val, target <= 1000
```
