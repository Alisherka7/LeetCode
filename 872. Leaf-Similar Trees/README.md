# 872. Leaf-Similar Trees

Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/d8fb1eb0-cee6-4979-a2b3-746f2d7e3750)


For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

### Example 1:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/333916d0-02d0-4ba6-b665-b8e70dcd4347)

```
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
```
### Example 2:
![image](https://github.com/Alisherka7/LeetCode/assets/38793933/412bf3c8-cce2-4e59-ae1a-07c08ea461d2)

```
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
```
 

### Constraints:
```
The number of nodes in each tree will be in the range [1, 200].
Both of the given trees will have values in the range [0, 200].
```
