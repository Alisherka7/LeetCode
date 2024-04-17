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
    String smallestString = "";

    public String smallestFromLeaf(TreeNode root){
        smallestFromLeaf(root, "");
        return smallestString;
    }

    public void smallestFromLeaf(TreeNode root, String currentString) {
        if(root == null){
            return ;
        }
        // '' = dba
        currentString = (char) ('a' + root.val) + currentString;

        // currentString += (char) ('a' + root.val);

        if(root.left == null && root.right == null){
            System.out.println(currentString);
            if(smallestString.isEmpty() || currentString.compareTo(smallestString) < 0){
                smallestString = currentString;
            }
        }

        // recursively traverse the left subtree
        if(root.left != null){
            smallestFromLeaf(root.left, currentString);
        }

        if(root.right != null){
            smallestFromLeaf(root.right, currentString);
        }
    }
}
