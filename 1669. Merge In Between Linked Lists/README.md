# 1669. Merge In Between Linked Lists

You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure indicate the result:


Build the result list and return its head.

<img width="536" alt="Screenshot 2024-03-20 at 2 01 38 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/d5327869-a7eb-4492-9a66-8dc703cdd7af">

### Example 1:

<img width="654" alt="Screenshot 2024-03-20 at 2 01 52 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/d89dc3cc-807c-4ed7-9ffe-2d522a79253f">

```
Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
```
### Example 2:

<img width="485" alt="Screenshot 2024-03-20 at 2 02 16 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/e0c14710-a671-49b5-afba-66e5e97edd56">


```
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.
```

### Constraints:
```
3 <= list1.length <= 10^4
1 <= a <= b < list1.length - 1
1 <= list2.length <= 10^4
```
