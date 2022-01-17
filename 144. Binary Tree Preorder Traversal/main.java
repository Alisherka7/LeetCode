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
    List<Integer> preOrderList = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root){
        preOrder(root);
        return preOrderList;
    }
    
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        preOrderList.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

}
