class Solution {

    public void findCanonicalForm(TreeNode root) {
        if (root == null) return;

        // Post-order traversal: first bring subtrees into their canonical form
        findCanonicalForm(root.left);
        findCanonicalForm(root.right);

        if (root.right == null) return;

        // Swap subtrees, so that left is non-empty
        if (root.left == null) {
            root.left = root.right;
            root.right = null;
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        // Swap subtrees
        if (left.val > right.val) {
            root.left = right;
            root.right = left;
        }
    }

    public boolean areEquivalent(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return (
            areEquivalent(root1.left, root2.left) &&
            areEquivalent(root1.right, root2.right)
        );
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        findCanonicalForm(root1);
        findCanonicalForm(root2);
        return areEquivalent(root1, root2);
    }
}
