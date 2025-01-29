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
}
*/

class Solution {
    public void postOrder(Node root, List<Integer> list){
        if(root == null) return;

        for(int index = 0; index < root.children.size(); index++){
            postOrder(root.children.get(index), list);
        }
        list.add(root.val);
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;   
    }
}