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
    int rootToLeaf = 0;
    public void preorder(TreeNode r, int currNum){
        if(r != null){
            currNum = (currNum << 1) | r.val;
            if(r.left == null && r.right == null){
                rootToLeaf += currNum;
            }
            preorder(r.left, currNum);
            preorder(r.right, currNum);
        }
    }
    
    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }
}
