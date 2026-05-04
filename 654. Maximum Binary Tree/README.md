# Maximum Binary Tree

### Understanding the Problem

You are given an integer array `nums = [3,2,1,6,0,5]` with no duplicates.

Using the following algorithms, implement a `maximum binary tree`:
1. Create a root node whose value is the maximum value in `nums`.
2. Recursively build the left subtree on the subarray prefix to the left of the maximum value.
3. Recursively build the right subtree on the subarray suffix to the right of the maximum value.

---

## Intuitive - Recursive Approach

To solve this problem, we use a **Recursive Divide and Conquer** approach.

1. Find the maximum value index in the current subarray and set that as the root node.
2. Recursively do the same for the left and right subarrays.

```
[3,2,1,6,0,5] -> max number is: 6

1. recursive call: [3,2,1] | 6 | [0,5]
2. recursive call: [2,1] | [3] | 6 | [5] | [0]
3. recursive call: [1] | [2] | [3] | 6 | [5] | [0]
```

---

### Get the Maximum Value Index from a Subarray

```python
def maxValue(self, nums: List[int], l: int, r: int) -> int:
    max_i = l
    for i in range(l, r):
        if nums[i] > nums[max_i]:
            max_i = i
    return max_i
```

---

### Recursive Construction Function

```python
def construct(self, nums: List[int], l: int, r: int) -> TreeNode:
    # If the left and right boundaries are equal, return None
    if l == r:
        return None

    # Get the index of the maximum value in the current subarray
    max_i = self.maxValue(nums, l, r)

    # Initialize the root node with the maximum value
    root = TreeNode(nums[max_i])

    # Recursively build the left subtree from l to max_i (exclusive)
    # e.g. [3,2,1,6,0,5] -> left subtree: [3,2,1]
    root.left = self.construct(nums, l, max_i)

    # Recursively build the right subtree from max_i+1 to r (exclusive)
    root.right = self.construct(nums, max_i + 1, r)

    return root
```

---

### Entry Point

```python
def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
    return self.construct(nums, 0, len(nums))
```

---

### Full Solution

```python
class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        return self.construct(nums, 0, len(nums))

    def construct(self, nums: List[int], l: int, r: int) -> TreeNode:
        # If the left and right boundaries are equal, return None
        if l == r:
            return None

        # Get the index of the maximum value in the current subarray
        max_i = self.maxValue(nums, l, r)

        # Initialize the root node with the maximum value
        root = TreeNode(nums[max_i])

        # Recursively build the left subtree from l to max_i (exclusive)
        root.left = self.construct(nums, l, max_i)

        # Recursively build the right subtree from max_i+1 to r (exclusive)
        root.right = self.construct(nums, max_i + 1, r)

        return root

    def maxValue(self, nums: List[int], l: int, r: int) -> int:
        max_i = l
        for i in range(l, r):
            if nums[i] > nums[max_i]:
                max_i = i
        return max_i
```

---

### Time & Space Complexity

**Time Complexity: O(n²) worst case, O(n log n) average case**
- At each recursive call, we scan the current subarray to find the maximum value — O(n) per level.
- Worst case: when the input array is already sorted (e.g. `[1,2,3,4,5]`), the tree becomes a skewed line. Each level scans the full remaining subarray, giving us n + (n-1) + (n-2) + ... = **O(n²)**.
- Average case: with balanced splits, we have O(log n) levels each doing O(n) work = **O(n log n)**.

**Space Complexity: O(n) worst case, O(log n) average case**
- Space is used by the recursion call stack, not extra arrays.
- Worst case: a skewed tree has depth n → **O(n)** stack frames.
- Average case: a balanced tree has depth log n → **O(log n)** stack frames.


# Monotonic Stack Approach - O(n)

