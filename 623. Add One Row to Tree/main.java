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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null){
            return root;
        }

        if(depth == 1){
            TreeNode newRootNode = new TreeNode(val);
            newRootNode.left = root;
            root = newRootNode;
        }

        if(depth-1 == 1 && (root.left != null || root.right != null)){
            TreeNode leftNode = new TreeNode(val);
            TreeNode rightNode = new TreeNode(val);
            leftNode.left = root.left;
            rightNode.right = root.right;
            root.left = leftNode;
            root.right = rightNode;
        }
        
        if(depth-1 == 1 && root.left == null && root.right == null){
            TreeNode leftNode = new TreeNode(val);
            TreeNode rightNode = new TreeNode(val);
            root.left = leftNode;
            root.right = rightNode;
        }

        addOneRow(root.left, val, depth-1);
        addOneRow(root.right, val, depth-1);
        return root;
    
    }
}
