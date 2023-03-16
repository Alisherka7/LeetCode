/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return makeNode(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderMap);
    }

    private TreeNode makeNode(int[] inorder, int iS, int iE, int[] postorder, int pS, int pE, Map<Integer, Integer> inorderMap) {

        if (pS > pE) {
            return null;
        }
        if (pS == pE) {
            return new TreeNode(postorder[pS]);
        }

        TreeNode node = new TreeNode(postorder[pE]);
        int rootIndex = inorderMap.get(postorder[pE]);
        int leftCount = rootIndex - iS;
        int rightCount = iE - rootIndex;

        node.left = makeNode(inorder, iS, iS + leftCount - 1, postorder, pS, pS + leftCount - 1, inorderMap);
        node.right = makeNode(inorder, rootIndex + 1, rootIndex + rightCount, postorder, pS + leftCount, pS + leftCount + rightCount - 1, inorderMap);

        return node;
    }
}
