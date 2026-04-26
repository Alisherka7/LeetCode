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