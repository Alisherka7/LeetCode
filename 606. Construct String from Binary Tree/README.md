# 606. Construct String from Binary Tree

Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

### Example 1:
<img width="320" alt="Screen Shot 2022-09-07 at 15 12 50" src="https://user-images.githubusercontent.com/38793933/188802128-1801e32c-e702-4848-879a-e911c17877b1.png">

```
Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
```
### Example 2:
<img width="256" alt="Screen Shot 2022-09-07 at 15 13 10" src="https://user-images.githubusercontent.com/38793933/188802226-198709e8-1607-4e18-8a4b-83e02d8abbcd.png">

```
Input: root = [1,2,3,null,4]
Output: "1(2()(4))(3)"
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
```

### Constraints:
```
The number of nodes in the tree is in the range [1, 10^4].
-1000 <= Node.val <= 1000
```
