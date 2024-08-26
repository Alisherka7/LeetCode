/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        bsd(root, result);
        return result;
    }

    public void bsd(Node currentNode, List<Integer> postorderList){
        if(currentNode == null){
            return;
        }

        for(Node childNode : currentNode.children){
            bsd(childNode, postorderList);
        }

        postorderList.add(currentNode.val);
    }
}
