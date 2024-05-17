class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root, lastRightNode = null;

        while (!stack.isEmpty() || currentNode != null) {
            // Push left nodes to the stack until reaching the leftmost node.
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            // Access the top node on the stack without removing it.
            // This node is the current candidate for processing.
            currentNode = stack.peek();

            // Check if the current node has an unexplored right subtree.
            // If so, shift to the right subtree unless it's the subtree we just visited.
            if (currentNode.right != lastRightNode && currentNode.right != null) {
                currentNode = currentNode.right;
                continue; // Continue in the while loop to push this new subtree's leftmost nodes.
            }

            // Remove the node from the stack, since we're about to process it.
            stack.pop();

            // If the node has no right subtree or the right subtree has already been visited,
            // then check if it is a leaf node with the target value.
            if (currentNode.right == null && currentNode.left == null && currentNode.val == target) {
                // If the stack is empty after popping, it means the root was a target leaf node.
                if (stack.isEmpty()) {
                    return null; // The tree becomes empty as the root itself is removed.
                }
                
                // Identify the parent of the current node.
                TreeNode parent = stack.isEmpty() ? null : stack.peek();

                // Disconnect the current node from its parent.
                if (parent != null) {
                    if (parent.left == currentNode) {
                        parent.left = null; // If current is a left child, set the left pointer to null.
                    } else {
                        parent.right = null; // If current is a right child, set the right pointer to null.
                    }
                }
            }

            // Mark this node as visited by setting 'lastRightNode' to 'currentNode' before moving to the next iteration.
            lastRightNode = currentNode;
            // Reset 'currentNode' to null to ensure the next node from the stack is processed.
            currentNode = null;
        }
        return root; // Return the modified tree.
    }
}
