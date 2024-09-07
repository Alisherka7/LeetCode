# 3217. Delete Nodes From Linked List Present in Array

You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

 

### Example 1:
```
Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]
```
<img width="397" alt="Screenshot 2024-09-07 at 7 06 05 PM" src="https://github.com/user-attachments/assets/42d493a8-53d3-4018-a7e2-b4e2bd11cf3d">

### Explanation:

```
Remove the nodes with values 1, 2, and 3.
```
### Example 2:
```
Input: nums = [1], head = [1,2,1,2,1,2]

Output: [2,2,2]
```
### Explanation:
<img width="465" alt="Screenshot 2024-09-07 at 7 06 14 PM" src="https://github.com/user-attachments/assets/778ba953-628a-499b-bbfa-c77094402497">


```
Remove the nodes with value 1.
```
### Example 3:
```
Input: nums = [5], head = [1,2,3,4]

Output: [1,2,3,4]
```
### Explanation:
<img width="398" alt="Screenshot 2024-09-07 at 7 06 28 PM" src="https://github.com/user-attachments/assets/fa0d1e6f-7c33-4d1d-90be-8a8999a83954">


```
No node has value 5.
```
 

### Constraints:
```
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^5
All elements in nums are unique.
The number of nodes in the given list is in the range [1, 10^5].
1 <= Node.val <= 10^5
The input is generated such that there is at least one node in the linked list that has a value not present in nums.
```
