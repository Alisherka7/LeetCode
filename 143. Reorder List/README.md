# 143. Reorder List

You are given the head of a singly linked-list. The list can be represented as:
```
L0 → L1 → … → Ln - 1 → Ln
```
Reorder the list to be on the following form:
```
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
```
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

### Example 1:
<img width="443" alt="Screenshot 2024-03-23 at 11 49 54 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/fb32250e-8f0a-4414-8a12-af0ae381a560">

```
Input: head = [1,2,3,4]
Output: [1,4,2,3]
```
### Example 2:

<img width="560" alt="Screenshot 2024-03-23 at 11 50 04 PM" src="https://github.com/Alisherka7/LeetCode/assets/38793933/4d4db774-780f-40fe-9f18-0d70c5c7eb85">

```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
```
 

### Constraints:
```
The number of nodes in the list is in the range [1, 5 * 10^4].
1 <= Node.val <= 1000
```
