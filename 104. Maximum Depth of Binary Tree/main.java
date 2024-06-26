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
    int height;
    
    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return height;
    }
    
    public void dfs(TreeNode node, int depth){
        if(node == null){
            return;
        }
        
        height = Math.max(height, depth);
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
}
